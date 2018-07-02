package problem

import scala.collection.immutable.List
import scala.collection.mutable.{ListBuffer => MutableList}

object P23 {

  var stack: MutableList[Int] = _

  def solution(t: String): Int = {

    stack = MutableList[Int]()
    val instructions = t.split("\\s").toList
    process(instructions)

  }

  def process(aInstructions: List[String]): Int = {

    aInstructions match {

      case instruction :: tail =>
        instruction match {
          case "+" => plus(tail)
          case "-" => minus(tail)
          case "DUP" => duplicate(None, tail)
          case "POP" => pop(tail)
          case number => push(number, tail)
        }
      case Nil => stack.last
    }

  }

  private def push(head: String, tail: List[String]) = {
    stack += head.toInt
    process(tail)
  }

  private def minus[Int](t: List[String]) = {
    if (stack.size < 2) {
      -1
    } else {
      val a = stack.last
      stack -= stack.last
      val b = stack.last
      stack -= stack.last
      stack += (a - b)
      process(t)
    }

  }

  private def plus[Int](t: List[String]) = {
    if (stack.size < 2) {
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

  private def pop[Int](t: List[String]) = {
    stack -= stack.last
    process(t)

  }

  private def duplicate[Int](h: Option[String], t: List[String]) = {

    if (h.isEmpty)
      stack += stack.last
    else
      stack += h.get.toInt

    process(t)

  }
}

