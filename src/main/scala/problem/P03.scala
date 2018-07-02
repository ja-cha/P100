package problem

object P03 {

  def nthBuiltIn[A](aNumber: Int, aList: List[A]): A =
    if (aList.isEmpty) throw new NoSuchElementException
    else aList(aNumber)


  def nthRecursive[A](aNumber: Int, aList: List[A]): A =
    (aNumber, aList) match {
      case (0, head :: _) => head
      case (n, _ :: tail) => nthRecursive(n - 1, tail)
      case _ => throw new NoSuchElementException
    }
}