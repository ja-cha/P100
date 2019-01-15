package problem

import org.scalatest._


class P25Speck
  extends FlatSpec with Matchers {

  "test 1" must "be Map(5->4)" in {

    val l1 =   List(-12, 5, 84, 395, 12, 54, 156)

    val l2 =   List(15, 126, 64, 4, 18, 12, 256)

    P25.
      solution(l1, l2).
      shouldBe {
        Map(5->4)
      }
  }

  }