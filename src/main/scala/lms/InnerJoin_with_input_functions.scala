package lms

/** ***************************************
  * Emitting Generated Code
  * ******************************************/
class InnerJoin_with_input_functions extends (((Array[(Int, Double)], (Array[(Int, Double)], (((Int, Double)) => Int, (((Int, Double)) => Int, (((Int, Double), (Int, Double))) => Double))))) => (Array[(Int, Double)])) {
  def apply(x2204: (Array[(Int, Double)], (Array[(Int, Double)], (((Int, Double)) => Int, (((Int, Double)) => Int, (((Int, Double), (Int, Double))) => Double))))): Array[(Int, Double)] = {
    val x2338 = scala.collection.mutable.ArrayBuilder.make[(Int, Double)]
    var x2339: Int = 0
    var x2340: Int = 0
    val x2302 = x2204._1
    val x2303 = x2302.length
    val x2317 = x2204._2
    val x2318 = x2317._1
    val x2319 = x2318.length
    val x2333 = x2317._2
    val x2334 = x2333._1
    var x2394 = new Array[(Int, Double)](x2303)
    var x2304 = 0
    while (x2304 < x2303) {
      val x2305 = x2302.apply(x2304)
      val x2306 = x2305._1
      val x2391 = x2305._2
      val x2393 = (x2306, x2391)
      x2394(x2304) = x2393
      x2304 += 1
    }
    val x2335 = x2333._2
    val x2336 = x2335._1
    var x2400 = new Array[(Int, Double)](x2319)
    var x2320 = 0
    while (x2320 < x2319) {
      val x2321 = x2318.apply(x2320)
      val x2322 = x2321._1
      val x2397 = x2321._2
      val x2399 = (x2322, x2397)
      x2400(x2320) = x2399
      x2320 += 1
    }
    val x2337 = x2335._2
    val x2414 = while ( {
      val x2341 = x2339
      val x2343 = x2340
      val x2342 = x2341 < x2303
      val x2344 = x2343 < x2319
      val x2345 = x2342 && x2344
      val x2346 = x2345
      x2345
    }) {
      val x2347 = x2339
      val x2349 = x2340
      val x2395 = x2394.apply(x2347)
      val x2396 = x2334(x2395)
      val x2401 = x2400.apply(x2349)
      val x2402 = x2336(x2401)
      val x2403 = x2396 == x2402
      val x2412 = if (x2403) {
        val x2404 = (x2395, x2401)
        val x2405 = x2337(x2404)
        val x2406 = (x2396, x2405)
        val x2407 = x2338 += x2406
        val x2358 = x2347 + 1
        x2339 = x2358
        val x2360 = x2349 + 1
        x2340 = x2360
        val x2408 = ()
        ()
      } else {
        val x2409 = x2396 < x2402
        val x2410 = if (x2409) {
          val x2358 = x2347 + 1
          x2339 = x2358
          val x2365 = ()
          ()
        } else {
          val x2360 = x2349 + 1
          x2340 = x2360
          val x2367 = ()
          ()
        }
        val x2411 = x2410
        x2410
      }
      val x2413 = x2412
      x2412
    }
    val x2415 = x2338.result
    val x2416 = x2415.length
    var x2426 = new Array[(Int, Double)](x2416)
    var x2375 = 0
    while (x2375 < x2416) {
      val x2417 = x2415.apply(x2375)
      val x2418 = x2417._1
      val x2419 = x2418
      val x2421 = x2415.apply(x2375)
      val x2422 = x2421._2
      val x2423 = x2422
      val x2425 = (x2419, x2423)
      x2426(x2375) = x2425
      x2375 += 1
    }
    val x2389 = x2426
    val x2390 = x2389
    x2389
  }
}

/** ***************************************
  * End of Generated Code
  * ******************************************/
