package problem

object P24 {

  def solution(number: Int): List[Int] = {

    val hexadecimalsList = asHexadecimalsList(number)

    println(hexadecimalsList)

    asBinaryList(hexadecimalsList)

  }

  private def asHexadecimalsList(aNumber: Int): List[Int] = {

    aNumber match {

      case number if number <= 2 => number :: Nil
      case number =>

        val highestPower2Val = Math.pow(2, exponent(number)).toInt

        val remainder = number - highestPower2Val

        remainder match {
          case 0 =>
            highestPower2Val :: Nil
          case n => highestPower2Val :: asHexadecimalsList(n)
        }

    }

  }


  private def asBinaryList(hexadecimalsList: List[Int]) = {

    val size = exponent(hexadecimalsList.head) + 1

    List.fill(size)(0).zipWithIndex.reverse.map { case (_, exponent) =>

      val value = Math.pow(2, exponent).toInt
      if (hexadecimalsList.contains(value)) {
        1
      } else {
        0
      }

    }
  }

  private def exponent(number: Int): Int = {

    var exponent = 0

    while (Math.pow(2, exponent).toInt <= number) {
      exponent = exponent + 1
    }
    if (exponent > 0) {
      exponent - 1
    } else {
      0
    }
  }


}
