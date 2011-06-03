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

class Problem02Test extends FeatureSpec with GivenWhenThen with MustMatchers {

  feature("Problem Two") {

    info("Find the last but one element of a list.")

    scenario("a function -penultimate- is call on a list") {

      given("a list of Ints")
      val list = List(1, 1, 2, 3, 5, 8)

      when("we ask for the last but one element")
      val result = new Problem02().penultimate(list)

      then("the last one must be returned")
      result must be === 5
    }

    scenario("a function -penultimate- is call on an empty list") {

      given("an empty list")
      val list = List.empty

      when("we ask for the but one element")
      then("an exception must be throws")
      evaluating {
        new Problem02().penultimate(list)
      } must produce [NoSuchElementException]
    }
  }
}