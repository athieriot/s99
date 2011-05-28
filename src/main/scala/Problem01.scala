package org.s99
 
class Problem01 {

   def last[A](list: List[A]): A = {
    return list.apply(list.length - 1)
   }
}
