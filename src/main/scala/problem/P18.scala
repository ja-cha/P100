package problem

object P18 {

  def extractSlice[A](from:Int, length:Int, aList: List[A]): List[A]={

    (from, length, aList) match {
      case (_,_,Nil) =>  Nil //in case of an empty list
      case (0, 0, h :: tail) =>  Nil
      case (0, length, h :: tail) => h :: extractSlice(0, length - 1, tail)
      case (from, length, h :: tail) => extractSlice(from - 1, length, tail)
    }


  }

}