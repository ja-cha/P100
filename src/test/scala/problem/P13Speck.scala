package problem

import org.scalatest._



class P13Speck
  extends FlatSpec with Matchers {


  val DATA = List(1,2,3,4,5)

  val EXPECTED = List(1,1,1,1,1,2,2,2,2,2,3,3,3,3,3,4,4,4,4,4,5,5,5,5,5)

  s"duplicating each item 5 times in $DATA" should s"yield $EXPECTED" in {
       EXPECTED shouldEqual {
        P13.duplicateEachTimes(5, DATA)
      }
  }
}

