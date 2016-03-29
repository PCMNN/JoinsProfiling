
/* Results:
 * Testing joins on Arrays of 100 elements
 * Run Lms for 0,01 ms
 * Run Dir for 0,01 ms
 * Testing joins on Arrays of 1000 elements
 * Run Lms for 0,06 ms
 * Run Dir for 0,04 ms
 * Testing joins on Arrays of 10000 elements
 * Run Lms for 1,15 ms
 * Run Dir for 0,44 ms
 * Testing joins on Arrays of 100000 elements
 * Run Lms for 8,45 ms
 * Run Dir for 4,76 ms
 * Testing joins on Arrays of 1000000 elements
 * Run Lms for 246,10 ms
 * Run Dir for 48,83 ms
 */
object run {

  def warmUp(t: Int): Unit = {
    val warmUp = (xs(10000), xs(10000))
    var go = true
    val t0 = System.nanoTime()
    var t1 = t0
    while (go) {
      lms_joins.inner(warmUp)
      direct_joins.inner(warmUp)
      t1 = System.nanoTime()
      if (t1 - t0 > t * 1e9) go = false
    }
    println("Warmed up for " + (t1 - t0) / 1e6 + " ms")
  }
  def xs(n: Int) = (0 until n).map(i => (i, i.toDouble)).toArray
  def inner(n: Int, k: Int): Unit = {
    println("Testing inner joins on Arrays of " + n + " elements")
    val in = (xs(n), xs(n))
    val time_lms = (for (i <- 0 until k) yield {
      val t10 = System.nanoTime()
      lms_joins.inner(in)
      val t20 = System.nanoTime()
      (t20 - t10) / 1e6
    }).sum / k.toDouble
    val time_dir = (for (i <- 0 until k) yield {
      val t20 = System.nanoTime()
      direct_joins.inner(in)
      val t30 = System.nanoTime()
      (t30 - t20) / 1e6
    }).sum / k.toDouble
    println(f"Run Lms for $time_lms%2.2f ms")
    println(f"Run Dir for $time_dir%2.2f ms")
  }
  def outer(n: Int, k: Int): Unit = {
    println("Testing outer joins on Arrays of " + n + " elements")
    val in = (xs(n), xs(n))
    val time_lms = (for (i <- 0 until k) yield {
      val t10 = System.nanoTime()
      lms_joins.outer(in)
      val t20 = System.nanoTime()
      (t20 - t10) / 1e6
    }).sum / k.toDouble
    val time_dir = (for (i <- 0 until k) yield {
      val t20 = System.nanoTime()
      direct_joins.outer(in)
      val t30 = System.nanoTime()
      (t30 - t20) / 1e6
    }).sum / k.toDouble
    println(f"Run Lms for $time_lms%2.2f ms")
    println(f"Run Dir for $time_dir%2.2f ms")
  }

  def main(args: Array[String]): Unit = {
    val N = args.headOption.getOrElse("100000").toInt
    val K = 5
    warmUp(180)
    var n = 100
    while (n <= N) {
      inner(n, K)
      outer(n, K)
      n *= 10
    }
  }
}
