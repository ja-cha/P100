package problem

object P06 {

  def isPalindrome[A](aList: List[A]): Boolean =
    aList == aList.reverse


}