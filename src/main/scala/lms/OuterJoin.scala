package lms

/** ***************************************
  * Emitting Generated Code
  * ******************************************/
class OuterJoin extends (((Array[(Int, Double)], Array[(Int, Double)])) => (Array[(Int, Double)])) {
  def apply(x1709: (Array[(Int, Double)], Array[(Int, Double)])): Array[(Int, Double)] = {
    val x1856 = scala.collection.mutable.ArrayBuilder.make[(Int, Double)]
    var x1857: Int = 0
    var x1858: Int = 0
    val x1826 = x1709._1
    val x1827 = x1826.length
    val x1841 = x1709._2
    val x1842 = x1841.length
    val x1712 = { x1710: ((Int, Double)) =>
      val x1711 = x1710._1
      x1711: Int
    }
    var x1930 = new Array[(Int, Double)](x1842)
    var x1843 = 0
    while (x1843 < x1842) {
      val x1844 = x1841.apply(x1843)
      val x1845 = x1844._1
      val x1927 = x1844._2
      val x1929 = (x1845, x1927)
      x1930(x1843) = x1929
      x1843 += 1
    }
    val x1722 = { x1720: ((Int, Double)) =>
      val x1721 = x1720._2
      x1721: Double
    }
    var x1940 = new Array[(Int, Double)](x1827)
    var x1828 = 0
    while (x1828 < x1827) {
      val x1829 = x1826.apply(x1828)
      val x1830 = x1829._1
      val x1937 = x1829._2
      val x1939 = (x1830, x1937)
      x1940(x1828) = x1939
      x1828 += 1
    }
    val x1719 = { x1713: (((Int, Double), (Int, Double))) =>
      val x1714 = x1713._1
      val x1715 = x1714._2
      val x1716 = x1713._2
      val x1717 = x1716._2
      val x1718 = x1715 + x1717
      x1718: Double
    }
    val x1966 = while ( {
      val x1859 = x1857
      val x1861 = x1858
      val x1860 = x1859 < x1827
      val x1862 = x1861 < x1842
      val x1863 = x1860 || x1862
      val x1864 = x1863
      x1863
    }) {
      val x1865 = x1857
      val x1866 = x1858
      val x1867 = x1865 == x1827
      val x1964 = if (x1867) {
        val x1931 = x1930.apply(x1866)
        val x1932 = x1712(x1931)
        val x1933 = x1722(x1931)
        val x1934 = (x1932, x1933)
        val x1935 = x1856 += x1934
        val x1873 = x1866 + 1
        x1858 = x1873
        val x1936 = ()
        ()
      } else {
        val x1876 = x1866 == x1842
        val x1962 = if (x1876) {
          val x1941 = x1940.apply(x1865)
          val x1942 = x1712(x1941)
          val x1943 = x1722(x1941)
          val x1944 = (x1942, x1943)
          val x1945 = x1856 += x1944
          val x1882 = x1865 + 1
          x1857 = x1882
          val x1946 = ()
          ()
        } else {
          val x1941 = x1940.apply(x1865)
          val x1942 = x1712(x1941)
          val x1931 = x1930.apply(x1866)
          val x1932 = x1712(x1931)
          val x1947 = x1942 == x1932
          val x1960 = if (x1947) {
            val x1948 = (x1941, x1931)
            val x1949 = x1719(x1948)
            val x1950 = (x1942, x1949)
            val x1951 = x1856 += x1950
            val x1882 = x1865 + 1
            x1857 = x1882
            val x1873 = x1866 + 1
            x1858 = x1873
            val x1952 = ()
            ()
          } else {
            val x1953 = x1942 < x1932
            val x1958 = if (x1953) {
              val x1943 = x1722(x1941)
              val x1944 = (x1942, x1943)
              val x1954 = x1856 += x1944
              val x1882 = x1865 + 1
              x1857 = x1882
              val x1955 = ()
              ()
            } else {
              val x1933 = x1722(x1931)
              val x1934 = (x1932, x1933)
              val x1956 = x1856 += x1934
              val x1873 = x1866 + 1
              x1858 = x1873
              val x1957 = ()
              ()
            }
            val x1959 = x1958
            x1958
          }
          val x1961 = x1960
          x1960
        }
        val x1963 = x1962
        x1962
      }
      val x1965 = x1964
      x1964
    }
    val x1967 = x1856.result
    val x1968 = x1967.length
    var x1978 = new Array[(Int, Double)](x1968)
    var x1911 = 0
    while (x1911 < x1968) {
      val x1969 = x1967.apply(x1911)
      val x1970 = x1969._1
      val x1971 = x1970
      val x1973 = x1967.apply(x1911)
      val x1974 = x1973._2
      val x1975 = x1974
      val x1977 = (x1971, x1975)
      x1978(x1911) = x1977
      x1911 += 1
    }
    val x1925 = x1978
    val x1926 = x1925
    x1925
  }
}

/** ***************************************
  * End of Generated Code
  * ******************************************/
