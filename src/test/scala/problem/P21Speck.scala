package problem

import org.scalatest._

import scala.collection.immutable.List



class P21Speck
  extends FlatSpec with Matchers {

  val symbol ='√

  val DATA = List('a,'b,'d,'e,'f,'g,'h,'i,'j)

  val EXPECTED = List('a,'b, symbol,'d,'e,'f,'g,'h,'i,'j)

  s"inserting $symbol at slot 2 in $DATA" should s" yield $EXPECTED" in {
       EXPECTED shouldEqual {
        P21.insertAt(2, symbol, DATA)
      }
  }
}

