package problem


class P25(l1: List[Int], l2: List[Int]) {


  def solution(): (Int, Int) = {

    var map = (Int.MinValue, Int.MaxValue)

    l1.foreach(n1 => {
      l2.foreach(n2 => {
        val currentDistance = Math.abs(n1.asInstanceOf[Long] - n2.asInstanceOf[Long])
        val originalDistance = Math.abs(map._1.asInstanceOf[Long] - map._2.asInstanceOf[Long])
        if (currentDistance < originalDistance) {
          map = (n1 -> n2)
        }
      })
    })
    map
  }

  def recursiveSolution(): (Int, Int) = {

    val sortedList1 = l1.sortWith(_ < _)
    val sortedList2 = l2.sortWith(_ < _)

    def find(l1: List[Int], l2: List[Int], map: (Int, Int)): (Int, Int) = {

      if (l1.isEmpty) {
        map
      }
      else if (l2.isEmpty) {
        find(l1.tail, sortedList2, map)
      }
      else {

        val currentDistance = Math.abs(l1.head.asInstanceOf[Long] - l2.head.asInstanceOf[Long])
        val originalDistance = Math.abs(map._1.asInstanceOf[Long] - map._2.asInstanceOf[Long])

        if (currentDistance == 0) {
          find(List.empty, List.empty, (l1.head -> l2.head))
        }
        else if (currentDistance < originalDistance) {
          find(l1, l2.tail, (l1.head -> l2.head))
        }
        else if (l1.head < l2.head) {
          find(l1.tail, sortedList2, map)
        }
        else {
          find(l1, l2.tail, map)
        }

      }
    }

    find(sortedList1, sortedList2, (Int.MinValue, Int.MaxValue))

  }

}

object P25 {

  def apply(list1: List[Int], list2: List[Int]): P25 = new P25(list1, list2)
}
