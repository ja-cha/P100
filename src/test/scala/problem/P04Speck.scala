package problem

import org.scalatest._

class P04Speck
  extends FlatSpec with Matchers {


  val DATA = List('A' to 'Z': _*)
  val EXPECTED = DATA.size

  s"The length of $DATA" should  s"be $EXPECTED" in {
    EXPECTED shouldBe {

      P04.lengthRecursive( DATA )
    }
  }

}

