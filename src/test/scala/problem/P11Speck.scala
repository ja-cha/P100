package problem

import org.scalatest._



class P11Speck
  extends FlatSpec with Matchers {


  val DATA = List(4->'a, 1->'b, 2 ->'c, 2 ->'a, 1 ->'d, 4 ->'e)

  val EXPECTED = List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)

  s"Length decoded $DATA into sublists" should s"be $EXPECTED" in {
      (EXPECTED) shouldEqual {
        P11.lengthDecodeIntoSublists(DATA)
      }
  }
}

