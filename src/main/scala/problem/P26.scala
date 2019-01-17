package problem

/**
  * Created by jabt on 7/22/18.
  */
object P26 {

  def solution(v:Int): Option[Int]  = {


    val one :PartialFunction[Int, Option[Int]] = { case 1 => Some(1) }
    val two: PartialFunction[Int, Option[Int]] = { case 2 => Some(2) }
    val none: PartialFunction[Int, Option[Int]] = { case _ => None }


    one orElse two orElse none apply v


  }

}
