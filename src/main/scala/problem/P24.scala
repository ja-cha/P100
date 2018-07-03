package problem

import java.util

import scala.collection.mutable.ListBuffer

object P24 {


    var l = new ListBuffer[Int]()
  def solution(number: Int):Int = {


    //25 =
    //20 + 5
    //16 + 9
    //8 + 1
    // 16 + 8 + 1
// 11001
    decimate(number).map{ n =>

      val toThePowerOf = Math.sqrt(n).floor.toInt
      val v  = Math.pow(2, toThePowerOf).toInt
      println( "2^" + toThePowerOf +"=" + v)
      l += v
      val r =   n - v


    }

  //  println( paired(number))
  //  println( drill(number) )
       // val w = Math.pow(2,pow).toInt

    0
  }
  private def drill(number:Int):(ListBuffer[Int],Int)={

    paired(number).foldLeft((new ListBuffer[Int](), 0))
    {
      case ((values, remainder), pair)=>

        if(remainder>0){
          val x = drill(remainder)
          values ++= x._1
        }

        val toThePowerOf = Math.sqrt(pair._1 * pair._2).floor.toInt
        val v =   Math.pow(2, toThePowerOf).toInt
        values += v
        val r =   pair._1 * pair._2 - v

        println( "remainder:"+r)

        val p = paired(r)
        println( "-----")

        (values, r)
    }
  }

private def decimate(number:Int):List[Int]= {

  number.toString.reverse.zipWithIndex.map {

    case (n, i) => {

      val radix = (0 to i).foldLeft("1") {
        (acc, i) =>
          if (i == 0)
            acc + ""
          else acc + "0"
      }.toInt

      radix * n.toString.toInt



    }

  }.toList.reverse

}

private def paired(number:Int):List[(Int, Int)]= {

  number.toString.reverse.zipWithIndex.map {

    case (c, i) => {

      val value = c.toString.toInt

      val radix = (0 to i).foldLeft("1") {
        (acc, i) =>
          if (i == 0)
            acc + ""
          else acc + "0"
      }.toInt
      (radix, value)


    }


  }.toList.reverse
}
}
