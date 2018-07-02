package problem

object P18 {

  def extractSlice[A](aFrom: Int, aLength: Int, aList: List[A]): List[A] = {

    (aFrom, aLength, aList) match {
      case (_, _, Nil) => Nil //in case of an empty list
      case (0, 0, _ :: _) => Nil
      case (0, length, h :: tail) => h :: extractSlice(0, length - 1, tail)
      case (from, length, _ :: tail) => extractSlice(from - 1, length, tail)
    }


  }

}