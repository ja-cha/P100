package problem

import org.scalatest._

import scala.collection.immutable.List



class P18Speck
  extends FlatSpec with Matchers {


  val DATA = List('c, 'd, 'a, 'e, 'a, 'b, 'e, 'b, 'c, 'f, 'd, 'd)

  val EXPECTED = List('a, 'e, 'a, 'b)

  s"extracting a slice from $DATA" should s"yield $EXPECTED" in {
       EXPECTED shouldEqual {
        P18.extractSlice(2, 4, DATA)
      }
  }
}

