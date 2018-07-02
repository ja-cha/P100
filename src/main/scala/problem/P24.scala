package problem

object P24 {


  def solution(number: Int) = {

    number.toString.reverse.zipWithIndex.map {
      case (c, i) => {

        val value = c.toString.toInt

        val radix = (0 to i).foldLeft("1") {
          (acc, i) =>
            if (i == 0)
              acc + ""
            else acc + "0"
        }.toInt
        val n = (radix * value).toInt
        val pow = Math.sqrt(n).floor.toInt

        val w = Math.pow(2,pow).toInt
      println( n + " = "+ w +"+"+ (n-w))


      }

    }
  }


}
