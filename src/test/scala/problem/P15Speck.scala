package problem

import org.scalatest._


class P15Speck
  extends FlatSpec with Matchers {


  val DATA:List[Int] = List(1 to 20: _*)

  val EXPECTED:(List[Int], List[Int]) = (List(1 to 10: _*), List(11 to 20: _*))

  s"splitting list into two sub-lists in $DATA" should s"yield $EXPECTED" in {
    EXPECTED shouldEqual {
      P15.splitAt(10, DATA)
    }
  }
}

