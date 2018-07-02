package problem

import org.scalatest._



class P09Speck
  extends FlatSpec with Matchers {


  val DATA = List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)

  val EXPECTED = List(List('a, 'a, 'a, 'a), List('b), List('c, 'c), List('a, 'a), List('d), List('e, 'e, 'e, 'e))

  s"""consecutive compression of $DATA""" should s"""be $EXPECTED""" in {
      (EXPECTED) shouldEqual {
        P09.sublistConsecutives(DATA)
      }
    }
}

