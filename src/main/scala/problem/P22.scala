package problem

object P22 {

  def solution (a: Array[Int]):Int = {
    val (ones, zeros) = subLists(a.toList)
    List(ones.size, zeros.size).min

  }


  def subLists[Int](aList: List[Int]): (List[Int], List[Int]) =
    aList match {
      case Nil => (Nil, Nil)
      case h :: tail =>
        val (ones, zeros) = subLists(tail)
        if (h == 1) {
          (h :: ones, zeros)
        }
        else {
          (ones, h :: zeros)
        }
    }

}
