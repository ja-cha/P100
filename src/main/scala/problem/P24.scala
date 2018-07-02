package problem

object P24 {


  def solution(number: Int) = {

    number.toString.reverse.zipWithIndex.map {
      case (c, i) => {

        val value = c.toString.toInt

        val radix = (0 to i).foldLeft("") {
          (acc, i) =>
            if (i == 0)
              acc + "1"
            else acc + "0"
        }.toInt
        val n = radix * value
      println( n)
      println(  Math.sqrt(n).floor.toInt)


      }

    }
  }


}
