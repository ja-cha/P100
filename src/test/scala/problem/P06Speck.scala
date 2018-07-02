package problem

import org.scalatest._

class P06Speck
  extends FlatSpec with Matchers {


  val DATA = List(1,2,3,4,5,4,3,2,1)

  s"$DATA" should  "be a palindrome" in {
    assert( P06.isPalindrome( DATA ))
  }

}

