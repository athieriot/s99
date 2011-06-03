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

class Problem05Test extends FeatureSpec with GivenWhenThen with MustMatchers {

  feature("Problem Five") {

    info("Reverse the elements of a list.")

    scenario("a function -reverse- is call on a list") {

      given("a list of Ints")
      val list = List(1, 1, 2, 3, 5, 8)

      when("we ask to reverse it")
      val result = new Problem05().reverse(list)

      then("we get the original list with elements reversed")
      result must be === List(8, 5, 3, 2, 1, 1)
    }

    scenario("a function -reverse- is call on an empty list") {

      given("an empty list")
      val list = List.empty

      when("we ask to reverse it")
      val result = new Problem05().reverse(list)

      then("the we get an empty list")
      result must be === List.empty
    }
  }
}