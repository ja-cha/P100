package problem

object P15 {

  def splitAt[A](aNumber: Int, aList: List[A]): (List[A], List[A]) =
    (aNumber, aList) match {
      case (_, Nil) => (Nil, Nil)
      case (0, list) => (Nil, list)
      case (n, h :: tail) =>
        val (pre, post) = splitAt(n - 1, tail)
        (h :: pre, post)
    }

}