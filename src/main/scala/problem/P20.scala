package problem

object P20 {

  def removeAt[A](index: Int, list: List[A]): List[A] = {

    (index, list) match {
      case (_, Nil) => Nil
      case (1, _ :: tail) => tail
      case (`index`, h :: tail) => h :: removeAt(`index` - 1, tail)
    }


  }


}