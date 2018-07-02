package problem

object P19 {

  def rotateLeft[A](shifts: Int, list: List[A]): List[A] = {

    def inner(shifts: Int, subList: List[A], list: List[A]): List[A] = {
      (shifts, subList, list) match {
        case (_, List(_), Nil) => Nil
        case (0, sl, l) => l ::: sl
        case (ls, sl, h :: t) => inner(ls - 1, sl ::: List(h), t)
      }
    }

    inner(shifts, Nil, list)
  }

  def rotateLeftAlt[A](n: Int, ls: List[A]): List[A] = {
    val nBounded = if (ls.isEmpty) 0 else n % ls.length
    if (nBounded < 0) rotateLeftAlt(nBounded + ls.length, ls)
    else (ls drop nBounded) ::: (ls take nBounded)
  }

}