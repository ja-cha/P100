package problem

object P07 {

  def flatten(aList: List[Any]): List[Any] =
    aList.flatMap {
        case nested:List[_] => flatten(nested)
        case flat => List(flat)
    }

}