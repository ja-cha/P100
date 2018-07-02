package problem

object P08 {


  def consecutiveCompress[A](aList: List[A]): List[A] = { aList match {
    case Nil => Nil
    case h :: tail => h :: consecutiveCompress(tail.dropWhile(_ == h))
  } }
}