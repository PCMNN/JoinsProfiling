package direct

class pairedOuterJoin extends (((Array[(Int, Double)], Array[(Int, Double)])) => (Array[(Int, Double)])) {
  def apply(in: (Array[(Int, Double)], Array[(Int, Double)])): Array[(Int, Double)] = {
    def f(xy: (Double, Double)) = xy._1 * xy._2
    def f1(x: Double) = x
    def f2(y: Double) = y
    val ordK = implicitly[Ordering[Int]]
    val (xs, ys) = in
    val res = scala.collection.mutable.ArrayBuilder.make[(Int, Double)]
    var i = 0
    var j = 0
    val n1 = xs.length
    val n2 = ys.length
    while (i < n1 || j < n2) {
      if (i == n1) {
        val y = ys(j)
        res += ((y._1, f2(y._2)))
        j = j + 1
      } else if (j == n2) {
        val x = xs(i)
        res += ((x._1, f1(x._2)))
        i = i + 1
      } else {
        val x = xs(i)
        val y = ys(j)
        val cmp = ordK.compare(x._1, y._1)
        if (cmp == 0) {
          res += ((x._1, f((x._2, y._2))))
          i = i + 1
          j = j + 1
        } else if (cmp < 0) {
          res += ((x._1, f1(x._2)))
          i = i + 1
        } else {
          res += ((y._1, f2(y._2)))
          j = j + 1
        }
      }
    }
    res.result
  }
}
