package problem

import org.scalatest._

class P00Speck
  extends FlatSpec with Matchers {

  val DATA = "CAFE"
  val EXPECTED = 51966

  s"Hexadecimal '$DATA'" should s"be Decimal '$EXPECTED'" in {
    EXPECTED shouldBe {
      P00.hexToInt(DATA)
    }
  }

}