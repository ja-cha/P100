package problem

object P10 {

  def lengthEncodeSublists[A](aList: List[A]): List[(Int,A)] = {

     val (subList, rest) = aList.span( _ == aList.head)
     rest match {
       case Nil => List(subList.size -> subList.head)
       case _ => subList.size -> subList.head :: lengthEncodeSublists(rest)
     }
}
}