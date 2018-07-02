package problem

object P16 {

  def findFirstNonDuplicate[A](aList: List[A]): Option[A] = {

    val map = aList
      .foldLeft(Map[A, Int]()) {
        (map, ch) => map + (ch -> (map.getOrElse(ch, 0) + 1))
      }
    aList.find(map(_) == 1)

  }
}