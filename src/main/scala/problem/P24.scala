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

  private def asBase2List(aNumber: Int): List[Int] = {

   aNumber match {

      case number if number <= 2 =>  Nil :+ number
      case number =>
        val highestPower2Result = Math.pow(2, highestExponentIn(2, number)).toInt

        val remainder = number - highestPower2Result

        remainder match {
          case 0 =>
               Nil :+ highestPower2Result
          case r =>   asBase2List(r) :+ highestPower2Result
        }
    }

  }

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

  private def highestExponentIn(base:Int, number: Int): Int = {

    var highestExponent= 0

    while (Math.pow(base, highestExponent).toInt <= number) {
      highestExponent = highestExponent + 1
    }
    if (highestExponent > 0) {
      highestExponent - 1
    } else {
      0
    }
  }


}
