package scala

import org.scalatest.FeatureSpec
import org.scalatest.GivenWhenThen
import org.scalatest.matchers.MustMatchers
import java.security.InvalidParameterException

/**
 * Created by IntelliJ IDEA.
 * User: aurelien
 * Date: 26/05/11
 * Time: 22:50
 */

class Problem03Test extends FeatureSpec with GivenWhenThen with MustMatchers {

  feature("Problem Three") {

    info("Find the Kth element of a list.")

    scenario("a function -nth- is call on a list") {

      given("a list of Ints")
      val list = List(1, 1, 2, 3, 5, 8)
      given ("an indice")
      var indice = 2

      when("we ask for the Kth element")
      val result = new Problem03().nth(indice, list)

      then("the Kth element must be returned")
      result must be === 2
    }

    scenario("a function -nth- is call on an empty list") {

      given("an empty list")
      val list = List.empty
      given ("an indice")
      var indice = 2

      when("we ask for the Kth element")
      then("an exception must be throws")
      evaluating {
        new Problem03().nth(indice, list)
      } must produce [NoSuchElementException]
    }

    scenario("a function -nth- is call on a list with an invalid indice") {

      given("an empty list")
      val list = List.empty
      given ("an invalid indice")
      var indice = -1

      when("we ask for the bad element")
      then("an exception must be throws")
      evaluating {
        new Problem03().nth(indice, list)
      } must produce [NoSuchElementException]

      and("if we ask for an overheaded element")
      indice = 99

      then("an exception must be throws too")
      evaluating {
        new Problem03().nth(indice, list)
      } must produce [NoSuchElementException]
    }
  }
}