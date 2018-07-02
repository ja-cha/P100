package problem
object P13 {

  def duplicateEachTimes[A](times:Int, aList: List[A]):List[A]  = {
      aList.flatMap{case(item) => List.fill(times)(item)}
  }


}