package problem

import org.scalatest._


class P14Speck
  extends FlatSpec with Matchers {


  val DATA = List(1 to 25: _*)

  val EXPECTED = List(1, 2, 3, 4, 5, 6, 8, 9, 10, 11, 12, 13, 15, 16, 17, 18, 19, 20, 22, 23, 24, 25)

  s"dropping each item 7th item in $DATA" should s"yield $EXPECTED" in {
    EXPECTED shouldEqual {
      P14.dropNthItem(7, DATA)
    }
  }
}

