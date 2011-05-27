package org.s99
 
class ProblemOne {

   def last[A](list: List[A]): A = {
    return list.apply(list.length - 1)
   }
}
