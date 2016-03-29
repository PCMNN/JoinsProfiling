import lms._

object lms_joins {

  def inner(xys: (Array[(Int, Double)], Array[(Int, Double)])) = (new pairedInnerJoin)(xys)
  def outer(xys: (Array[(Int, Double)], Array[(Int, Double)])) = (new pairedOuterJoin)(xys)
}
