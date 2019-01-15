package problem


object P25 {

  def solution(l1:List[Int],l2:List[Int]): Map[Int, Int] = {

  var min = Map.empty[Int, Int]

    l1.foreach(n1 =>{
      l2.foreach(n2 =>{
          val current =  Math.abs(n1) + Math.abs(n2)
          val original = Math.abs(min.keys.sum) + Math.abs(min.values.sum)
          if(min.isEmpty | current < original){
            min = Map[Int, Int](n1 -> n2)
          }
      })
    })
    min
  }

}
