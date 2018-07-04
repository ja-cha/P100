package problem

import org.scalatest._


class P24Speck
  extends FlatSpec with Matchers {

  "0" must "be List(0)" in {
    P24.
      solution(0).
      shouldBe {
        List(0)
      }
  }

  "1" must "be List(1)" in {
    P24.
      solution(1).
      shouldBe {
        List(1)
      }
  }

  "2" must "be List(1, 0)" in {
    P24.
      solution(2).
      shouldBe {
        List(1, 0)
      }
  }

  "3" must "be List(1, 1)" in {
    P24.
      solution(3).
      shouldBe {
        List(1, 1)
      }
  }
  "4" must "be List(1,0,0)" in {
    P24.
      solution(4).
      shouldBe {
        List(1,0,0)
      }
  }

  "5" must "be List(1, 0, 1)" in {
    P24.
      solution(5).
      shouldBe {
        List(1, 0, 1)
      }
  }

  "12" must "be List(1, 1, 0, 0)" in {
    P24.
      solution(12).
      shouldBe {
        List(1, 1, 0, 0)
      }
  }

  "20" must "be List(1, 0, 1, 0, 0)" in {
    P24.
      solution(20).
      shouldBe {
        List(1, 0, 1, 0, 0)
      }
  }

  "25" must "be List(1, 1, 0, 0, 1)" in {
    P24.
      solution(25).
      shouldBe {
        List(1, 1, 0, 0, 1)
      }
  }

  "50" must "be List(1, 1, 0, 0, 1, 0)" in {
    P24.
      solution(50).
      shouldBe {
        List(1, 1, 0, 0, 1, 0)
      }
  }

  "57" must "be List(1, 1, 1, 0, 0, 1)" in {
    P24.
      solution(57).
      shouldBe {
        List(1, 1, 1, 0, 0, 1)
      }
  }

  "269" must "be List(1, 0, 0, 0, 0, 1, 1, 0, 1)" in {
    P24.
      solution(269).
      shouldBe {
        List(1, 0, 0, 0, 0, 1, 1, 0, 1)
      }
  }

 "1412" must "be List(1, 0, 1, 1, 0, 0, 0, 0, 1, 0, 0)" in {
    P24.
      solution(1412).
      shouldBe {
        List(1, 0, 1, 1, 0, 0, 0, 0, 1, 0, 0)
      }
  }

 "1413" must "be List(1, 0, 1, 1, 0, 0, 0, 0, 1, 0, 1)" in {
    P24.
      solution(1413).
      shouldBe {
        List(1, 0, 1, 1, 0, 0, 0, 0, 1, 0, 1)
      }
  }

  }