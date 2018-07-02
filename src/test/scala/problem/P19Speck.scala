package problem

import org.scalatest._

import scala.collection.immutable.List


class P19Speck
  extends FlatSpec with Matchers {


  val DATA = List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)

  val EXPECTED = List(5, 6, 7, 8, 9, 10, 1, 2, 3, 4)

  s"left rotating 4 slots $DATA" should s" yield $EXPECTED" in {
    EXPECTED shouldEqual {
      P19.rotateLeft(4, DATA)
    }
  }
}

