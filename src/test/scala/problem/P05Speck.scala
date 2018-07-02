package problem

import org.scalatest._

class P05Speck
  extends FlatSpec with Matchers {


  val DATA = List('A' to 'Z': _*)
  val EXPECTED = DATA.reverse

  s"The reverse of $DATA" should  s"be $EXPECTED" in {
    EXPECTED shouldBe {

     P05.reverseRecursive( DATA )
    }
  }

}

