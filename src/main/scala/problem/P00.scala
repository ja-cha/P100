package problem

object P00 {

  val BASE = 16

  def hexToIntBuiltIn(hexString: String): Int = Integer.parseInt(hexString, BASE)

  def hexToInt(hexString: String): Int ={

  val  hexMap = Map('0' -> 0, '1' -> 1, '2' -> 2, '3' -> 3, '4' -> 4, '5' -> 5, '6' -> 6, '7' -> 7, '8' -> 8, '9' -> 9, 'A' -> 10, 'B' -> 11, 'C' -> 12, 'D' -> 13, 'E' -> 14, 'F' -> 15)

    hexString.reverse.zipWithIndex.map{
      case (c, i) =>  hexMap(c) * Math.pow(BASE, i)
    }.sum.toInt

}

}