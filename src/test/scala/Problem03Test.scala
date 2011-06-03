package scala

import org.scalatest.FeatureSpec
import org.scalatest.GivenWhenThen
import org.scalatest.matchers.MustMatchers
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
  }
}