package scala

import java.security.InvalidParameterException

class Problem03 {

  def nth[A](n: Int, list: List[A]): A = {
    if (n < 0 || n >= list.length)
      throw new InvalidParameterException

    for(count <- 0 to list.length)
      if (count == n) return list.apply(count)

    throw new InvalidParameterException
  }
}
