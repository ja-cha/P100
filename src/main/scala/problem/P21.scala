package problem

object P21 {

  def insertAt[A](index: Int, item: A, list: List[A]): List[A] = {

    list.splitAt(index) match {
      case (left, right) => left ::: List(item) ::: right
    }


  }


}