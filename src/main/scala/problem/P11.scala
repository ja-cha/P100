package problem

object P11 {

  def lengthDecodeIntoSublists[A](aList: List[(Int,A)]):List[A ]  = {
      aList.flatMap{case(length, item) => List.fill(length)(item)}
  }


}