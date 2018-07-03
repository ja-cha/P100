package problem

import org.scalatest._


class P24Speck
  extends FlatSpec with Matchers {

  "25" must "be 10111" in {
    P24.
      solution(25).
      shouldBe {
        0//"10111"
      }
  }

  }