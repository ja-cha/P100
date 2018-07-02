package problem

import org.scalatest._

import scala.collection.immutable.List


class P20Speck
  extends FlatSpec with Matchers {


  val DATA = List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)

  val EXPECTED = List(1, 2, 3, 5, 6, 7, 8, 9, 10)

  s"removing item 4 from $DATA" should s" yield $EXPECTED" in {
    EXPECTED shouldEqual {
      P20.removeAt(4, DATA)
    }
  }
}

