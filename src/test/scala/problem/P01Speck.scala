package problem

import org.scalatest._

class P01Speck
  extends FlatSpec with Matchers {

  val DATA = List(1 to 10: _*)
  val EXPECTED = 10

  "Last item" should s"be $EXPECTED" in {
    assert(P01.lastRecursive( DATA ) == 10)
  }

}

