package problem

import org.scalatest._

class P05Speck
  extends FlatSpec with Matchers {


  val DATA:List[Char] = List('A' to 'Z': _*)
  val EXPECTED:List[Char] = DATA.reverse

  s"The reverse of $DATA" should s"be $EXPECTED" in {
    EXPECTED shouldBe {

      P05.reverseRecursive(DATA)
    }
  }

}

