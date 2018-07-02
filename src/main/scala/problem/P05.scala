package problem

object P05 {

  def reverseBuiltIn[A](aList: List[A]): List[A] = aList.reverse

  def reverseRecursive[A](aList: List[A]): List[A] =
    aList match {
    case head :: Nil  => List(head)
    case head :: tail => reverseRecursive(tail) ::: List(head)
    case _         => throw new NoSuchElementException
  }

}