package problem

import org.scalatest._

class P03Speck
  extends FlatSpec with Matchers {


  val DATA = List(1,8,3,5,4,7,2,9,11,12,51,18)
  val EXPECTED = DATA(5)


  "The 5th item" should  "be 7" in {
    EXPECTED shouldBe {
      P03.nthRecursive(5, DATA )
    }
  }

}

