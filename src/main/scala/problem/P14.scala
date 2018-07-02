package problem
object P14 {

  def dropNthItem[A](n:Int, aList: List[A]):List[A]  = {
    def inner[A](c: Int, aList: List[A]): List[A] =
      (c, aList) match {
        case (_, Nil) => {
          Nil
        }
        case (1, head :: tail) => {
          inner(n, tail)
        }
        case (_, head :: tail) => {
          head :: inner(c - 1, tail)
        }
      }
    inner(n, aList)
  }

}