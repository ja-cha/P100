package problem


class P25(l1: List[Int], l2: List[Int]) {


  def solution(): Map[Int, Int] = {

    var min = Map.empty[Int, Int]

    l1.foreach(n1 => {
      l2.foreach(n2 => {
        val originalDistance = Math.abs(min.keys.sum - min.values.sum)
        val currentDistance = Math.abs(n1 - n2)
        if (min.isEmpty | currentDistance <= originalDistance) {
          min = Map[Int, Int](n1 -> n2)
        }
      })
    })
    min
  }

  def recursiveSolution(): Map[Int, Int] = {

    val list1 =  l1.sortWith(_ < _)
    val list2 = l2.sortWith(_ < _)

    def recursive(aList1: List[Int], aList2: List[Int], min: Map[Int, Int]): Map[Int, Int] = {

      (aList1, aList2) match {

        case (l1, l2) if (l1.isEmpty) => {
          min
        }
        case (l1, l2) if (l2.isEmpty) => {
          recursive(l1.tail, list2, min)
        }
        case (l1, l2) => {

          val currentDistance = Math.abs(l1.head - l2.head)
          val originalDistance = Math.abs(min.keys.sum - min.values.sum)

          if (min.isEmpty | currentDistance < originalDistance) {
            recursive(l1, l2.tail, Map[Int, Int](l1.head -> l2.head))
          }
          else if (currentDistance == originalDistance) {
            recursive(List.empty, List.empty, Map[Int, Int](l1.head -> l2.head))
          }
          else {
            if (l1.head <= l2.head) {
              recursive(l1.tail, list2, min)
            }
            else {
              recursive(l1, l2.tail, min)
            }
          }

        }
      }
    }

    recursive(list1, list2, Map.empty)

  }

}

object P25 {

  def apply(list1: List[Int], list2: List[Int]): P25 = new P25(list1, list2)
}
