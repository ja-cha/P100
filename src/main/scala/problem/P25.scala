package problem


class P25(l1: List[Int], l2: List[Int]) {

  def solution(): (Int, Int) = {

    var valuePair = (Int.MinValue, Int.MaxValue)

    l1.foreach(n1 => {
      l2.foreach(n2 => {
        val currentDistance = Math.abs(n1.asInstanceOf[Long] - n2.asInstanceOf[Long])
        val originalDistance = Math.abs(valuePair._1.asInstanceOf[Long] - valuePair._2.asInstanceOf[Long])
        if (currentDistance < originalDistance) {
          valuePair = (n1 -> n2)
        }
      })
    })
    valuePair
  }

  def recursiveSolution(): (Int, Int) = {

    val sortedList1 = l1.sortWith(_ < _)
    val sortedList2 = l2.sortWith(_ < _)

    def find(l1: List[Int], l2: List[Int], valuePair: (Int, Int)): (Int, Int) = {

      (l1, l2) match {

        case (List(), _) => valuePair
        case (_, List()) => find(l1.tail, sortedList2, valuePair)
        case _ =>
          val currentDistance = Math.abs(l1.head.asInstanceOf[Long] - l2.head.asInstanceOf[Long])
          val originalDistance = Math.abs(valuePair._1.asInstanceOf[Long] - valuePair._2.asInstanceOf[Long])
          if (currentDistance == 0) {
            find(List.empty, List.empty, (l1.head -> l2.head))
          }
          else if (currentDistance < originalDistance) {
            find(l1, l2.tail, (l1.head -> l2.head))
          }
          else if (l1.head < l2.head) {
            find(l1.tail, sortedList2, valuePair)
          }
          else {
            find(l1, l2.tail, valuePair)
          }
      }

    }

    find(sortedList1, sortedList2, (Int.MinValue, Int.MaxValue))
  }
}

object P25 {
  def apply(list1: List[Int], list2: List[Int]): P25 = new P25(list1, list2)
}
