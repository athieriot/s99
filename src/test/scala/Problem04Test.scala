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

class Problem04Test extends FeatureSpec with GivenWhenThen with MustMatchers {

  feature("Problem Four") {

    info("Find the number of elements of a list.")

    scenario("a function -length- is call on a list") {

      given("a list of Ints")
      val list = List(1, 1, 2, 3, 5, 8)

      when("we ask for the number of elements")
      val result = new Problem04().length(list)

      then("the number of elements must be returned")
      result must be === 6
    }

    scenario("a function -length- is call on an empty list") {

      given("an empty list")
      val list = List.empty

      when("we ask for the number of elements")
      val result = new Problem04().length(list)

      then("the 0 must be return")
      result must be === 0
    }
  }
}