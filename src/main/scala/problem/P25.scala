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

    def recursive(l1: List[Int], l2: List[Int]): Map[Int, Int] =

      l1 match {
        case List() => Map.empty
        case n1 :: _ => {
          val n2 = l2.head
          val original = Math.abs(min.keys.sum) + Math.abs(min.values.sum)
          val current = Math.abs(n1) + Math.abs(n2)

          if (min.isEmpty | current < original) {
            min = Map[Int, Int](n1 -> n2)
          }
          if (l2.tail.isEmpty) {
            recursive(l1.tail, list2)
          }
          else {
            recursive(l1, l2.tail)
          }
        }
          min
      }

    recursive(list1.sortWith(_ < _), list2.sortWith(_ < _))
  }

}

object P25 {

  def apply(list1: List[Int], list2: List[Int]): P25 = new P25(list1, list2)
}
