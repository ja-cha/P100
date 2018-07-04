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

        val pow2Val = Math.pow(2, highestPower2In(number)).toInt

        number - pow2Val match {
          case 0 =>
            pow2Val :: Nil
          case remainder => pow2Val :: asHexadecimalsList(remainder)
        }

    }

  }


  private def asBinaryList(hexadecimalsList: List[Int]) = {

    val size = highestPower2In(hexadecimalsList.head) + 1

    List.fill(size)(0).zipWithIndex.reverse.map { case (_, toThePowerOfX) =>

      val value = Math.pow(2, toThePowerOfX).toInt
      if (hexadecimalsList.contains(value)) {
        1
      } else {
        0
      }

    }
  }

  private def highestPower2In(number: Int): Int = {

    var toThePowerOfX = 0

    while (Math.pow(2, toThePowerOfX).toInt <= number) {
      toThePowerOfX = toThePowerOfX + 1
    }
    if (toThePowerOfX > 0) {
      toThePowerOfX - 1
    } else {
      0
    }
  }


}
