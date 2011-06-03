package scala

class Problem04 {

  def length[A](list: List[A]): Int = {
    countRecursive(0, list)
  }

  private def countRecursive[A](actual: Int, list: List[A]): Int = (actual, list) match {
    case (n, list :: Nil) => n + 1
    case (n, list :: element) => countRecursive(n + 1, element)
    case (n, _) => 0
  }
}
