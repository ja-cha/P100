package problem

import org.scalatest._

import scala.collection.immutable.List


class P22Speck
  extends FlatSpec with Matchers {


  val DATA = Array(1,0,1,0,0,0,1,0,0)

  val EXPECTED = 3

  s"result" should s"be $EXPECTED" in {
    EXPECTED shouldEqual {
      P22.solution(DATA)
    }
  }
}


