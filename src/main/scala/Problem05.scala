package scala

class Problem05 {

  def reverse[A](list: List[A]): List[A] = {
    if(list.isEmpty) return list

    var newList: List[A] = List.empty

    for(a <- list)
      newList ::= a

    return newList
  }
}
