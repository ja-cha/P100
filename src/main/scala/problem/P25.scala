package problem


object P25 {

  def solution(l1: List[Int], l2: List[Int]): (Int, Int) = {

    var smallestDifference = (Int.MinValue, Int.MaxValue)

    l1.foreach(n1 => {
      l2.foreach(n2 => {
        val currentDifference = Math.abs(n1.asInstanceOf[Long] - n2.asInstanceOf[Long])
        val previousDifference = Math.abs(smallestDifference._1.asInstanceOf[Long] - smallestDifference._2.asInstanceOf[Long])
        if (currentDifference < previousDifference) {
          smallestDifference = (n1 -> n2)
        }
      })
    })
    smallestDifference
  }

  def recursiveSolution(l1: List[Int], l2: List[Int]): (Int, Int) = {

    def find(l1: List[Int], l2: List[Int], smallestDifference: (Int, Int)): (Int, Int) = {

      (l1, l2) match {

        case (List(), _) => smallestDifference
        case (_, List()) => find(l1.tail, l2, smallestDifference)
        case _ =>

          val currentDifference = Math.abs(l1.head.asInstanceOf[Long] - l2.head.asInstanceOf[Long])
          val previousDifference = Math.abs(smallestDifference._1.asInstanceOf[Long] - smallestDifference._2.asInstanceOf[Long])
          //Can't get any smaller, done
          if (currentDifference == 0) {
            find(List.empty, List.empty, (l1.head -> l2.head))
          }
          else if (currentDifference < previousDifference) {
            //Current number of l1 is smaller than current number of l2
            if (l1.head < l2.head) {
              // Any subsequent number in l2 will increase in size. From here one the difference can only increase.
              // So it is not necessary to compare the current number of l1 against the remaining items in l2.
              // Continue with the tail of l1
              find(l1.tail, l2, (l1.head -> l2.head))
            }
            else {
              find(l1, l2.tail, (l1.head -> l2.head))
            }
          }
          else if (l1.head < l2.head) {
            find(l1.tail, l2, smallestDifference)
          }
          else {
            find(l1, l2.tail, smallestDifference)
          }
      }
    }

    find(l1.sortWith(_ < _), l2.sortWith(_ < _), (Int.MinValue, Int.MaxValue))
  }

}
