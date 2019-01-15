package problem


object P25 {

  def solution(list1:List[Int],list2:List[Int]): Map[Int, Int] = {

  var min = Map.empty[Int, Int]

    list1.foreach(n1 =>{
      list2.foreach(n2 =>{
          val original = Math.abs(min.keys.sum) + Math.abs(min.values.sum)
          val current =  Math.abs(n1) + Math.abs(n2)
          if(min.isEmpty | current < original){
            min = Map[Int, Int](n1 -> n2)
          }
      })
    })
    min
  }

}
