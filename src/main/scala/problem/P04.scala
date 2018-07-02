package problem

object P04 {

  def lengthBuiltIn[A](aList: List[A]): Int = aList.size


  def lengthRecursive[A](aList: List[A]): Int =
    aList match {
    case head :: Nil  => 1
    case _ :: tail => 1 + lengthRecursive(tail)
    case _         => throw new NoSuchElementException
  }
}