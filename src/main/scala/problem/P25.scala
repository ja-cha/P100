package problem


class P25(list1: List[Int], list2: List[Int]) {


  var min = Map.empty[Int, Int]


  def solution(): Map[Int, Int] = {

    list1.foreach(n1 => {
      list2.foreach(n2 => {
        val original = Math.abs(min.keys.sum - min.values.sum)
        val current = Math.abs(n1 - n2)
        if (min.isEmpty | current <= original) {
          min = Map[Int, Int](n1 -> n2)
        }
      })
    })
    min
  }

  def recursiveSolution(): Map[Int, Int] = {

    val list1Sorted = list1.sortWith(_ < _)
    val list2Sorted = list2.sortWith(_ < _)

    def recursive(list1: List[Int], list2: List[Int]): Map[Int, Int] = {

      (list1, list2) match {

        case (l1, l2) if (l1.isEmpty) => {
          min
        }
        case (l1, l2) if (l2.isEmpty) => {
          recursive(l1.tail, list2)
        }
        case (l1, l2) => {

          val original = Math.abs(min.keys.sum - min.values.sum)
          val current = Math.abs(l1.head - l2.head)

          if (min.isEmpty | current <= original) {
            min = Map[Int, Int](l1.head -> l2.head)
          }
          if (current == original) {
            recursive(List.empty, List.empty)
          }
          if (l1.head < l2.head) {
            recursive(l1.tail, list2Sorted)
          } else {
            recursive(l1, l2.tail)
          }

        }
      }
    }

    recursive(list1Sorted, list2Sorted)
  }

}

object P25 {

  def apply(list1: List[Int], list2: List[Int]): P25 = new P25(list1, list2)
}
