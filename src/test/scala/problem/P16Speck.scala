package problem

import org.scalatest._



class P16Speck
  extends FlatSpec with Matchers {


  val DATA = List('c, 'd, 'a, 'e, 'a, 'b, 'e, 'b, 'c, 'f, 'd, 'd)

  val EXPECTED = Some('f)

  s"first non duplicate in $DATA" should s"yield $EXPECTED" in {
       EXPECTED shouldEqual {
        P16.findFirstNonDuplicate( DATA)
      }
  }
}

