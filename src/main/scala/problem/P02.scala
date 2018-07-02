package problem

object P02{

  def penultimateBuiltIn[A](aList: List[A]): A =
    if (aList.isEmpty) throw new NoSuchElementException
    else aList.init.last

  def penultimateRecursive[A](aList: List[A]): A =
    aList match {
    case head :: _ :: Nil  => head
    case _ :: tail => penultimateRecursive(tail)
    case _         => throw new NoSuchElementException
  }
}