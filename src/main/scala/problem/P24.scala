package problem

object P24 {

  def solution(number: Int): List[Int] = {

    asBinaryList(asBase2List(number))

  }

  private def asBase2List(aNumber: Int): List[Int] = {

    aNumber match {

      case number if number <= 2 => number :: Nil
      case number =>
        val highestPower2Result = Math.pow(2, highestExponentIn(2, number)).toInt

        val remainder = number - highestPower2Result

        remainder match {
          case 0 =>
            highestPower2Result :: Nil
          case r => highestPower2Result :: asBase2List(r)
        }
    }
  }


  private def asBinaryList(hexadecimalsList: List[Int]) = {

    val size = highestExponentIn(2, hexadecimalsList.head)

    List.fill(size+1)(0).zipWithIndex.reverse.map {
      case (slot, exp) if (hexadecimalsList.contains(Math.pow(2, exp).toInt)) => 1
      case _  => 0
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
