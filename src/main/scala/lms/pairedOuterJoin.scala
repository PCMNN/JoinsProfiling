package lms

/** ***************************************
  * Emitting Generated Code
  * ******************************************/
class pairedOuterJoin extends (((Array[(Int, Double)], Array[(Int, Double)])) => (Array[(Int, Double)])) {
  def apply(x723: (Array[(Int, Double)], Array[(Int, Double)])): Array[(Int, Double)] = {
    val x872 = scala.collection.mutable.ArrayBuilder.make[(Int, Double)]
    var x873: Int = 0
    var x874: Int = 0
    val x842 = x723._1
    val x843 = x842.length
    val x857 = x723._2
    val x858 = x857.length
    var x948 = new Array[(Int, Double)](x858)
    var x859 = 0
    while (x859 < x858) {
      val x860 = x857.apply(x859)
      val x861 = x860._1
      val x945 = x860._2
      val x947 = (x861, x945)
      x948(x859) = x947
      x859 += 1
    }
    val x736 = { x735: (Double) =>
      x735: Double
    }
    var x959 = new Array[(Int, Double)](x843)
    var x844 = 0
    while (x844 < x843) {
      val x845 = x842.apply(x844)
      val x846 = x845._1
      val x956 = x845._2
      val x958 = (x846, x956)
      x959(x844) = x958
      x844 += 1
    }
    val x731 = { x727: ((Double, Double)) =>
      val x728 = x727._1
      val x729 = x727._2
      val x730 = x728 + x729
      x730: Double
    }
    val x986 = while ( {
      val x875 = x873
      val x877 = x874
      val x876 = x875 < x843
      val x878 = x877 < x858
      val x879 = x876 || x878
      val x880 = x879
      x879
    }) {
      val x881 = x873
      val x882 = x874
      val x883 = x881 == x843
      val x984 = if (x883) {
        val x949 = x948.apply(x882)
        val x950 = x949._1
        val x951 = x949._2
        val x952 = x736(x951)
        val x953 = (x950, x952)
        val x954 = x872 += x953
        val x890 = x882 + 1
        x874 = x890
        val x955 = ()
        ()
      } else {
        val x893 = x882 == x858
        val x982 = if (x893) {
          val x960 = x959.apply(x881)
          val x961 = x960._1
          val x962 = x960._2
          val x963 = x736(x962)
          val x964 = (x961, x963)
          val x965 = x872 += x964
          val x900 = x881 + 1
          x873 = x900
          val x966 = ()
          ()
        } else {
          val x960 = x959.apply(x881)
          val x961 = x960._1
          val x949 = x948.apply(x882)
          val x950 = x949._1
          val x967 = x961 == x950
          val x980 = if (x967) {
            val x962 = x960._2
            val x951 = x949._2
            val x968 = (x962, x951)
            val x969 = x731(x968)
            val x970 = (x961, x969)
            val x971 = x872 += x970
            val x900 = x881 + 1
            x873 = x900
            val x890 = x882 + 1
            x874 = x890
            val x972 = ()
            ()
          } else {
            val x973 = x961 < x950
            val x978 = if (x973) {
              val x962 = x960._2
              val x963 = x736(x962)
              val x964 = (x961, x963)
              val x974 = x872 += x964
              val x900 = x881 + 1
              x873 = x900
              val x975 = ()
              ()
            } else {
              val x951 = x949._2
              val x952 = x736(x951)
              val x953 = (x950, x952)
              val x976 = x872 += x953
              val x890 = x882 + 1
              x874 = x890
              val x977 = ()
              ()
            }
            val x979 = x978
            x978
          }
          val x981 = x980
          x980
        }
        val x983 = x982
        x982
      }
      val x985 = x984
      x984
    }
    val x987 = x872.result
    val x988 = x987.length
    var x998 = new Array[(Int, Double)](x988)
    var x929 = 0
    while (x929 < x988) {
      val x989 = x987.apply(x929)
      val x990 = x989._1
      val x991 = x990
      val x993 = x987.apply(x929)
      val x994 = x993._2
      val x995 = x994
      val x997 = (x991, x995)
      x998(x929) = x997
      x929 += 1
    }
    val x943 = x998
    val x944 = x943
    x943
  }
}

/** ***************************************
  * End of Generated Code
  * ******************************************/
