package problem

object P12 {

  def duplicateEach[A](aList: List[A]):List[A]  = {
      aList.flatMap{case(item) => List(item, item)}
  }


}