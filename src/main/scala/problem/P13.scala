package problem

object P13 {

  def duplicateEachTimes[A](times: Int, aList: List[A]): List[A] = {
    aList.flatMap(item => List.fill(times)(item) )
  }


}