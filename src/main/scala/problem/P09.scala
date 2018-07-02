package problem
object P09 {

  def sublistConsecutives[A](aList: List[A]): List[List[A]] = {

     val (subList, rest) = aList.span( _ == aList.head)
     rest match {
       case Nil => List(subList)
       case _ => subList :: sublistConsecutives(rest)
     }
}
}