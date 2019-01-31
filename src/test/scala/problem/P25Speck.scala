package problem

import org.scalatest._


class P25Speck
  extends FlatSpec with Matchers {

  "solution 1" must "be (12->12)" in {

    val l1 = List(-12, 5, 84, 395, 12, 54, 156)

    val l2 = List(15, 126, 64, 4, 18, 12, 256)

    P25.solution(l1, l2).shouldBe {
      (12 -> 12)
    }
  }

  "recursiveSolution 1" must "be (12->12)" in {

    val l1 = List(-12, 5, 84, 395, 12, 54, 156)

    val l2 = List(15, 126, 64, 4, 18, 12, 256)

    P25.recursiveSolution(l1, l2).shouldBe {
      (12 -> 12)
    }
  }

  "solution 2" must "be (5->4)" in {

    val l1 = List(-12, 5, 84, 395, 123, 54, 156)

    val l2 = List(15, 126, 64, 4, 18, 12, 256)

    P25.solution(l1, l2).shouldBe {
      (5 -> 4)
    }
  }
  "recursiveSolution 2" must "be (5->4)" in {

    val l1 = List(-12, 5, 84, 395, 123, 54, 156)

    val l2 = List(15, 126, 64, 4, 18, 12, 256)


    P25.recursiveSolution(l1, l2).shouldBe {
      (5 -> 4)
    }
  }

  "solution 2" must "be (5->12)" in {

    val l1 = List(-12, 5, 84, 395, 489, -54, 156)

    val l2 = List(115, -126, -64, 48, 18, 12, 256)

    P25.solution(l1, l2).shouldBe {
      (5 -> 12)
    }
  }

  "recursiveSolution 3" must "be (5->12)" in {

    val l1 = List(-12, 5, 84, 395, 489, -54, 156)

    val l2 = List(115, -126, -64, 48, 18, 12, 256)

    P25.recursiveSolution(l1, l2).shouldBe {
      (5 -> 12)
    }
  }

}