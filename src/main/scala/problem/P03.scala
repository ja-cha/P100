package problem

object P03 {

  def nthBuiltIn[A](n: Int, aList: List[A]): A =
    if (aList.isEmpty) throw new NoSuchElementException
    else aList(n)


  def nthRecursive[A](n:Int, aList: List[A]): A =
    (n,aList) match {
    case (0, head :: _ ) => head
    case (n, _ :: tail) => nthRecursive(n-1,tail)
    case _         => throw new NoSuchElementException
  }
}