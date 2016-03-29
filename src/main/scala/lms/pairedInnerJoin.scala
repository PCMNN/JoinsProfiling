package lms

/** ***************************************
  * Emitting Generated Code
  * ******************************************/
class pairedInnerJoin extends (((Array[(Int, Double)], Array[(Int, Double)])) => (Array[(Int, Double)])) {
  def apply(x223: (Array[(Int, Double)], Array[(Int, Double)])): Array[(Int, Double)] = {
    val x352 = scala.collection.mutable.ArrayBuilder.make[(Int, Double)]
    var x353: Int = 0
    var x354: Int = 0
    val x322 = x223._1
    val x323 = x322.length
    val x337 = x223._2
    val x338 = x337.length
    var x410 = new Array[(Int, Double)](x323)
    var x324 = 0
    while (x324 < x323) {
      val x325 = x322.apply(x324)
      val x326 = x325._1
      val x407 = x325._2
      val x409 = (x326, x407)
      x410(x324) = x409
      x324 += 1
    }
    var x416 = new Array[(Int, Double)](x338)
    var x339 = 0
    while (x339 < x338) {
      val x340 = x337.apply(x339)
      val x341 = x340._1
      val x413 = x340._2
      val x415 = (x341, x413)
      x416(x339) = x415
      x339 += 1
    }
    val x231 = { x227: ((Double, Double)) =>
      val x228 = x227._1
      val x229 = x227._2
      val x230 = x228 * x229
      x230: Double
    }
    val x432 = while ( {
      val x355 = x353
      val x357 = x354
      val x356 = x355 < x323
      val x358 = x357 < x338
      val x359 = x356 && x358
      val x360 = x359
      x359
    }) {
      val x361 = x353
      val x363 = x354
      val x411 = x410.apply(x361)
      val x412 = x411._1
      val x417 = x416.apply(x363)
      val x418 = x417._1
      val x419 = x412 == x418
      val x430 = if (x419) {
        val x420 = x411._2
        val x421 = x417._2
        val x422 = (x420, x421)
        val x423 = x231(x422)
        val x424 = (x412, x423)
        val x425 = x352 += x424
        val x374 = x361 + 1
        x353 = x374
        val x376 = x363 + 1
        x354 = x376
        val x426 = ()
        ()
      } else {
        val x427 = x412 < x418
        val x428 = if (x427) {
          val x374 = x361 + 1
          x353 = x374
          val x381 = ()
          ()
        } else {
          val x376 = x363 + 1
          x354 = x376
          val x383 = ()
          ()
        }
        val x429 = x428
        x428
      }
      val x431 = x430
      x430
    }
    val x433 = x352.result
    val x434 = x433.length
    var x444 = new Array[(Int, Double)](x434)
    var x391 = 0
    while (x391 < x434) {
      val x435 = x433.apply(x391)
      val x436 = x435._1
      val x437 = x436
      val x439 = x433.apply(x391)
      val x440 = x439._2
      val x441 = x440
      val x443 = (x437, x441)
      x444(x391) = x443
      x391 += 1
    }
    val x405 = x444
    val x406 = x405
    x405
  }
}

/** ***************************************
  * End of Generated Code
  * ******************************************/
