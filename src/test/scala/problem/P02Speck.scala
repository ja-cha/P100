package problem

import org.scalatest._

class P02Speck
  extends FlatSpec with Matchers {

  val DATA = List(1 to 10: _*)
  val EXPECTED = 9

  s"Penultimate item of $DATA" should s"be $EXPECTED" in {
    EXPECTED shouldBe {
      P02.penultimateRecursive(DATA)
    }
  }
}