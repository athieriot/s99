package scala

class Problem03 {

  def nth[A](n: Int, list: List[A]): A = {

    for(count <- 0 to list.length)
      if (count == n) return list.apply(count)

    throw new NoSuchElementException
  }
}
