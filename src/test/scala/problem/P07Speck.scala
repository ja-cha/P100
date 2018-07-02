package problem

import org.scalatest._

class P07Speck
  extends FlatSpec with Matchers {


  val DATA =  List(List(1, 1), 2, List(3, List(List(5, 4), 9)))
  val EXPECTED = List(1,1,2,3,5,4,9)

    s"flattened $DATA" should  s"be $EXPECTED" in {
      EXPECTED shouldBe{
        P07.flatten(DATA)
      }
    }

}

