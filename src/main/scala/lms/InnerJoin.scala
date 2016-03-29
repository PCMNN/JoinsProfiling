package lms

/** ***************************************
  * Emitting Generated Code
  * ******************************************/
class InnerJoin extends (((Array[(Int, Double)], Array[(Int, Double)])) => (Array[(Int, Double)])) {
  def apply(x1219: (Array[(Int, Double)], Array[(Int, Double)])): Array[(Int, Double)] = {
    val x1348 = scala.collection.mutable.ArrayBuilder.make[(Int, Double)]
    var x1349: Int = 0
    var x1350: Int = 0
    val x1318 = x1219._1
    val x1319 = x1318.length
    val x1333 = x1219._2
    val x1334 = x1333.length
    val x1232 = { x1230: ((Int, Double)) =>
      val x1231 = x1230._1
      x1231: Int
    }
    var x1404 = new Array[(Int, Double)](x1319)
    var x1320 = 0
    while (x1320 < x1319) {
      val x1321 = x1318.apply(x1320)
      val x1322 = x1321._1
      val x1401 = x1321._2
      val x1403 = (x1322, x1401)
      x1404(x1320) = x1403
      x1320 += 1
    }
    var x1410 = new Array[(Int, Double)](x1334)
    var x1335 = 0
    while (x1335 < x1334) {
      val x1336 = x1333.apply(x1335)
      val x1337 = x1336._1
      val x1407 = x1336._2
      val x1409 = (x1337, x1407)
      x1410(x1335) = x1409
      x1335 += 1
    }
    val x1229 = { x1223: (((Int, Double), (Int, Double))) =>
      val x1224 = x1223._1
      val x1225 = x1224._2
      val x1226 = x1223._2
      val x1227 = x1226._2
      val x1228 = x1225 * x1227
      x1228: Double
    }
    val x1424 = while ( {
      val x1351 = x1349
      val x1353 = x1350
      val x1352 = x1351 < x1319
      val x1354 = x1353 < x1334
      val x1355 = x1352 && x1354
      val x1356 = x1355
      x1355
    }) {
      val x1357 = x1349
      val x1359 = x1350
      val x1405 = x1404.apply(x1357)
      val x1406 = x1232(x1405)
      val x1411 = x1410.apply(x1359)
      val x1412 = x1232(x1411)
      val x1413 = x1406 == x1412
      val x1422 = if (x1413) {
        val x1414 = (x1405, x1411)
        val x1415 = x1229(x1414)
        val x1416 = (x1406, x1415)
        val x1417 = x1348 += x1416
        val x1368 = x1357 + 1
        x1349 = x1368
        val x1370 = x1359 + 1
        x1350 = x1370
        val x1418 = ()
        ()
      } else {
        val x1419 = x1406 < x1412
        val x1420 = if (x1419) {
          val x1368 = x1357 + 1
          x1349 = x1368
          val x1375 = ()
          ()
        } else {
          val x1370 = x1359 + 1
          x1350 = x1370
          val x1377 = ()
          ()
        }
        val x1421 = x1420
        x1420
      }
      val x1423 = x1422
      x1422
    }
    val x1425 = x1348.result
    val x1426 = x1425.length
    var x1436 = new Array[(Int, Double)](x1426)
    var x1385 = 0
    while (x1385 < x1426) {
      val x1427 = x1425.apply(x1385)
      val x1428 = x1427._1
      val x1429 = x1428
      val x1431 = x1425.apply(x1385)
      val x1432 = x1431._2
      val x1433 = x1432
      val x1435 = (x1429, x1433)
      x1436(x1385) = x1435
      x1385 += 1
    }
    val x1399 = x1436
    val x1400 = x1399
    x1399
  }
}

/** ***************************************
  * End of Generated Code
  * ******************************************/
