package problem

import java.util

import scala.collection.mutable.ListBuffer

object P24 {


  def solution(number: Int):Int = {

    val pairs = paired(number)
    //25 =
    //20 + 5
    //16 + 9
    //8 + 1
    // 16 + 8 + 1
// 11001
    println( pairs)
    val l = pairs.map{
       (pair)=>
           val toThePowerOf = Math.sqrt(pair._1 * pair._2).floor.toInt
           val v =   Math.pow(2, toThePowerOf).toInt
           println( "2^" + toThePowerOf +"=" + v)
           val r =   pair._1 * pair._2 - v
           println( "remainder:"+r)

         val p = paired(r)
           println( "-----")

         p
    }
    println(l)
//    pairs.map{ p =>
//      val toThePowerOf = Math.sqrt(p._1 * p._2).floor.toInt
//      val v =   Math.pow(2, toThePowerOf).toInt
//      println( "2^" + toThePowerOf +"=" + v)
//      val r =   p._1 * p._2 - v
//      println( "remainder:"+r)
//      println( "-----")
//
//      p
//    }

       // val w = Math.pow(2,pow).toInt




    0
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
