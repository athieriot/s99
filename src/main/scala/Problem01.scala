package org.s99

class Problem01 {

  def last[A](list: List[A]): A = lastRecursive(list)

  private def lastRecursive[A](list: List[A]): A = list match {
    case h :: Nil => h
    case _ :: tail => lastRecursive(tail)
    case _ => throw new NoSuchElementException
  }
}
