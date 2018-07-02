package problem

import scala.collection.immutable.List
import scala.collection.mutable.{ListBuffer => MutableList}

object P23 {

  var stack:MutableList[Int] = null

  def solution(t: String):Int = {
    stack = MutableList[Int]()
    val instructions = t.split("\\s").toList
   val result = process(instructions)

    result

  }

  def process(aInstructions: List[String]):Int = {

    (aInstructions) match {
      case head :: tail => {
        head match {
          case "+" =>  plus( tail)
          case "-" => minus(tail)
          case "DUP" => duplicate(None, tail)
          case "POP" => pop(tail)
          case _ =>{
            stack += head.toInt
            process(tail)
          }
        }
      }
      case Nil => stack.last
    }

  }

  def minus[Int](t: List[String]) = {
    if(stack.size<2){
      -1
    }else {
      val a = stack.last
      stack -= stack.last
      val b = stack.last
      stack -= stack.last
      stack += (a - b)
      process(t)
    }

  }

  def plus[Int](t: List[String]) = {
    if(stack.size<2){
      -1
    }
    else {
      val a = stack.last
      stack -= stack.last
      val b = stack.last
      stack -= stack.last
      stack += (a + b)
      process(t)
    }
  }

  def pop[Int](t: List[String]) = {
    stack -= stack.last
    process(t)

  }

  def duplicate[Int](h: Option[String], t: List[String]) = {

    if(h.isEmpty)
      stack += stack.last
    else
      stack += h.get.toInt

    process(t)

  }
}

