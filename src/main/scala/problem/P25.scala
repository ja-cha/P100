package problem


class P25(list1: List[Int], list2: List[Int]) {


  var min = Map.empty[Int, Int]


  def solution(): Map[Int, Int] = {

    list1.foreach(n1 => {
      list2.foreach(n2 => {
        val original = Math.abs(min.keys.sum) + Math.abs(min.values.sum)
        val current = Math.abs(n1) + Math.abs(n2)
        if (min.isEmpty | current < original) {
          min = Map[Int, Int](n1 -> n2)
        }
      })
    })
    min
  }

  def recursiveSolution(): Map[Int, Int] = {

    val list1Sorted = list1.sortWith(_ < _)
    val list2Sorted = list2.sortWith(_ < _)

    def recursive(l1: List[Int], l2: List[Int]): Map[Int, Int] = {

      if (l1.isEmpty) {
        min
      }
      else if (l2.tail.isEmpty) {
        recursive(l1.tail, list2)
      }
      else {

        val original = Math.abs(min.keys.sum) + Math.abs(min.values.sum)
        val current = Math.abs(l1.head) + Math.abs(l2.head)

        if (original == 0 | current < original) {
          min = Map[Int, Int](l1.head -> l2.head)
        }
        if (l1.head < l2.head) {
          recursive(l1.tail, list2Sorted)
        } else {
          recursive(l1, l2.tail)
        }

      }
    }

    recursive(list1Sorted, list2Sorted)
  }

}

object P25 {

  def apply(list1: List[Int], list2: List[Int]): P25 = new P25(list1, list2)
}
