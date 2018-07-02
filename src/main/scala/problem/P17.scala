package problem

object P17 {

  def findFirstNonDuplicate[A](aList: List[A]):List[A] ={

  val r = aList match {
    case h::Nil => List[A](h)
    case h::t => {
      val cc = aList.filter( _ != h)
      t.filter(_ == h) ::: findFirstNonDuplicate(cc)
    }
    case _ => List()
  }
r

  }
}