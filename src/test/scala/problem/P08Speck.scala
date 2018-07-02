package problem

import org.scalatest._


class P08Speck
  extends FlatSpec with Matchers {


  val DATA = List('a', 'a', 'a', 'a', 'b', 'c', 'c', 'a', 'a', 'd', 'e', 'e', 'e', 'e')

  val EXPECTED = List('a', 'b', 'c', 'a', 'd', 'e')

  s"consecutive compression of $DATA" should s"be $EXPECTED" in {
    List('a', 'b', 'c', 'a', 'd', 'e') shouldBe {
      P08.consecutiveCompress(DATA)
    }
  }

}

