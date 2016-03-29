package lms

/** ***************************************
  * Emitting Generated Code
  * ******************************************/
class OuterJoin_with_input_functions extends (((Array[(Int, Double)], (Array[(Int, Double)], (((Int, Double)) => Int, (((Int, Double)) => Int, ((((Int, Double), (Int, Double))) => Double, (((Int, Double)) => Double, ((Int, Double)) => Double))))))) => (Array[(Int, Double)])) {
  def apply(x2736: (Array[(Int, Double)], (Array[(Int, Double)], (((Int, Double)) => Int, (((Int, Double)) => Int, ((((Int, Double), (Int, Double))) => Double, (((Int, Double)) => Double, ((Int, Double)) => Double))))))): Array[(Int, Double)] = {
    val x2904 = scala.collection.mutable.ArrayBuilder.make[(Int, Double)]
    var x2905: Int = 0
    var x2906: Int = 0
    val x2864 = x2736._1
    val x2865 = x2864.length
    val x2879 = x2736._2
    val x2880 = x2879._1
    val x2881 = x2880.length
    val x2895 = x2879._2
    val x2897 = x2895._2
    val x2898 = x2897._1
    var x2986 = new Array[(Int, Double)](x2881)
    var x2882 = 0
    while (x2882 < x2881) {
      val x2883 = x2880.apply(x2882)
      val x2884 = x2883._1
      val x2983 = x2883._2
      val x2985 = (x2884, x2983)
      x2986(x2882) = x2985
      x2882 += 1
    }
    val x2899 = x2897._2
    val x2901 = x2899._2
    val x2903 = x2901._2
    val x2896 = x2895._1
    var x2996 = new Array[(Int, Double)](x2865)
    var x2866 = 0
    while (x2866 < x2865) {
      val x2867 = x2864.apply(x2866)
      val x2868 = x2867._1
      val x2993 = x2867._2
      val x2995 = (x2868, x2993)
      x2996(x2866) = x2995
      x2866 += 1
    }
    val x2902 = x2901._1
    val x2900 = x2899._1
    val x3030 = while ( {
      val x2907 = x2905
      val x2909 = x2906
      val x2908 = x2907 < x2865
      val x2910 = x2909 < x2881
      val x2911 = x2908 || x2910
      val x2912 = x2911
      x2911
    }) {
      val x2913 = x2905
      val x2914 = x2906
      val x2915 = x2913 == x2865
      val x3028 = if (x2915) {
        val x2987 = x2986.apply(x2914)
        val x2988 = x2898(x2987)
        val x2989 = x2903(x2987)
        val x2990 = (x2988, x2989)
        val x2991 = x2904 += x2990
        val x2921 = x2914 + 1
        x2906 = x2921
        val x2992 = ()
        ()
      } else {
        val x2924 = x2914 == x2881
        val x3026 = if (x2924) {
          val x2997 = x2996.apply(x2913)
          val x2998 = x2896(x2997)
          val x2999 = x2902(x2997)
          val x3000 = (x2998, x2999)
          val x3001 = x2904 += x3000
          val x2930 = x2913 + 1
          x2905 = x2930
          val x3002 = ()
          ()
        } else {
          val x2997 = x2996.apply(x2913)
          val x3003 = x2896(x2997)
          val x2987 = x2986.apply(x2914)
          val x3004 = x2898(x2987)
          val x3005 = x3003 == x3004
          val x3024 = if (x3005) {
            val x3006 = (x2997, x2987)
            val x3007 = x2900(x3006)
            val x3008 = (x3003, x3007)
            val x3009 = x2904 += x3008
            val x2930 = x2913 + 1
            x2905 = x2930
            val x2921 = x2914 + 1
            x2906 = x2921
            val x3010 = ()
            ()
          } else {
            val x3011 = x3003 < x3004
            val x3022 = if (x3011) {
              val x3012 = x2896(x2997)
              val x3013 = x2902(x2997)
              val x3014 = (x3012, x3013)
              val x3015 = x2904 += x3014
              val x2930 = x2913 + 1
              x2905 = x2930
              val x3016 = ()
              ()
            } else {
              val x3017 = x2898(x2987)
              val x3018 = x2903(x2987)
              val x3019 = (x3017, x3018)
              val x3020 = x2904 += x3019
              val x2921 = x2914 + 1
              x2906 = x2921
              val x3021 = ()
              ()
            }
            val x3023 = x3022
            x3022
          }
          val x3025 = x3024
          x3024
        }
        val x3027 = x3026
        x3026
      }
      val x3029 = x3028
      x3028
    }
    val x3031 = x2904.result
    val x3032 = x3031.length
    var x3042 = new Array[(Int, Double)](x3032)
    var x2967 = 0
    while (x2967 < x3032) {
      val x3033 = x3031.apply(x2967)
      val x3034 = x3033._1
      val x3035 = x3034
      val x3037 = x3031.apply(x2967)
      val x3038 = x3037._2
      val x3039 = x3038
      val x3041 = (x3035, x3039)
      x3042(x2967) = x3041
      x2967 += 1
    }
    val x2981 = x3042
    val x2982 = x2981
    x2981
  }
}

/** ***************************************
  * End of Generated Code
  * ******************************************/
