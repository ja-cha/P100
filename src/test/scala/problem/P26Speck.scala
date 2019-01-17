package problem

import org.scalatest._


class P26Speck
  extends FlatSpec with Matchers {

  "1" must "Some(1)" in {
    P26.
      solution(1).
      shouldBe {
        Some(1)
      }
  }
  "2" must "Some(2)" in {
    P26.
      solution(2).
      shouldBe {
        Some(2)
      }
  }
  "0" must "None" in {
    P26.
      solution(3).
      shouldBe {
        None
      }
  }

}