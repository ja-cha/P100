package problem

import org.scalatest._


class P10Speck
  extends FlatSpec with Matchers {


  val DATA = List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)

  val EXPECTED = List(4 -> 'a, 1 -> 'b, 2 -> 'c, 2 -> 'a, 1 -> 'd, 4 -> 'e)

  s"""conscutive Length encoded sublists of $DATA""" should s"""be $EXPECTED""" in {
    EXPECTED shouldEqual {
      P10.lengthEncodeSublists(DATA)
    }
  }
}

