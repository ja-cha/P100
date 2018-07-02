package problem

import org.scalatest._


class P12Speck
  extends FlatSpec with Matchers {


  val DATA = List(1, 2, 3, 4, 5)

  val EXPECTED = List(1, 1, 2, 2, 3, 3, 4, 4, 5, 5)

  s"duplicating each item in $DATA" should s"yield $EXPECTED" in {
    EXPECTED shouldEqual {
      P12.duplicateEach(DATA)
    }
  }
}

