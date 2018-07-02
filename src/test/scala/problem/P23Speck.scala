package problem

import org.scalatest._


class P23Speck
  extends FlatSpec with Matchers {

  "result1" must "be 7" in {
    P23.
      solution("13 DUP 4 POP 5 DUP + DUP + -").
      shouldBe{
        7
      }
  }

  "result2" must "be 13" in {
    P23.
      solution("13").
      shouldBe {
        13
      }
  }

  "result3" must "be -1" in {
    P23.
      solution("-").
      shouldBe {
        -1
      }
  }

  "result4" must "be 20" in {
    P23.
      solution("13 DUP 4 POP 5 DUP + DUP + - +").
      shouldBe {
        20
      }
  }



}
