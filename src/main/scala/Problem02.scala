package scala

class Problem02 {

  def penultimate[A](list: List[A]): A = list match {
    case h :: _ :: Nil => h
    case _ :: tail => penultimate(tail)
    case _ => throw new NoSuchElementException
  }
}
