package problem

object P01{

  def lastBuiltIn[A](aList: List[A]): A =
    aList.last

  def lastRecursive[A](aList: List[A]): A =
    aList match {
    case head :: Nil  => head
    case _ :: tail => lastRecursive(tail)
    case _         => throw new NoSuchElementException
  }
}