package problem

object P24 {

  def solution(number: Int): List[Int] = {

  val base2List =  asBase2List(number)
  val base2ExpandedList  = asBase2ExpandedList(base2List, List.empty)

    println(s"  decimal (base  10) : $number")
    println(s"= binary  (base   2) : ${base2List.reverse.mkString(" + ")}")
    println(s"= binary  (expanded) : ${base2ExpandedList.mkString(", ")}")
    println("-------------------------------------------------------------")
    base2ExpandedList
  }

  /**
    * for example:
    * input number: 269
    * as base 2 list: 256, 8, 4, 1
    *
    */
  private def asBase2List(aNumber: Int): List[Int] = {

    /**
      * for example:
      * the highest base 2 number that fits into 269 is 256
      *
      */
   def highestBase2ThatFitsInto(aNumber: Int): Int = {

      var powOf = 0
      while (Math.pow(2, powOf).toInt <= aNumber) {
        powOf = powOf + 1
      }
      if (powOf > 0) {powOf - 1} else {0}
   }

   aNumber match {

      case number if number <= 2 =>  Nil :+ number
      case number =>
        val highestBase2 = Math.pow(2, highestBase2ThatFitsInto(number)).toInt

        val nextHighestBase2 = number - highestBase2

        nextHighestBase2 match {
          case 0 =>  Nil :+ highestBase2
          case r =>   asBase2List(r) :+ highestBase2
        }
    }

  }

  /**
    * for example
    * base 2 list of: 256, 8, 4, 1
    * in expanded binary would be: 1, 0, 1, 1, 0, 0, 0, 0, 1, 0, 0
    *
    */
  private def asBase2ExpandedList(base2List: List[Int], seedList:List[Int]):List[Int] = {

    val number = Math.pow(2, seedList.size).toInt

    base2List match {
      case Nil => seedList
      case 0::Nil => 0::seedList
      case h::Nil if  h == number =>1::seedList
      case h::Nil => asBase2ExpandedList (h::Nil, 0::seedList )
      case h::tail if  h == number => asBase2ExpandedList(tail, 1::seedList)
      case h::tail => asBase2ExpandedList(h::tail, 0::seedList)

    }
  }




}
