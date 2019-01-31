package problem

object P24 {

  def solution(number: Int): List[Int] = {

  val base2List =  asBase2List(number)
  val binaryList  = asBinaryList(List(),base2List)

    println(s"  decimal (base  10) : $number")
    println(s"= binary  (base   2) : ${base2List.reverse.mkString(" + ")}")
    println(s"= binary  (expanded) : ${binaryList.mkString(", ")}")
    println("-------------------------------------------------------------")
    binaryList
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

  private def asBinaryList(l:List[Int], base2List: List[Int]):List[Int] = {

    val number = Math.pow(2, l.size).toInt

    base2List match {
      case Nil => l
      case 0::Nil => 0::l
      case h::Nil if  h == number =>1::l
      case h::Nil => asBinaryList (0::l, h::Nil )
      case h::tail if  h == number => asBinaryList(1::l, tail)
      case h::tail => asBinaryList(0::l, h::tail)

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
