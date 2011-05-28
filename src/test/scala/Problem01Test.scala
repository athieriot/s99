package org.s99

import org.scalatest.FeatureSpec
import org.scalatest.GivenWhenThen
import org.scalatest.matchers.MustMatchers
import collection.immutable.Stack

/**
 * Created by IntelliJ IDEA.
 * User: aurelien
 * Date: 26/05/11
 * Time: 22:50
 */

class Problem01Test extends FeatureSpec with GivenWhenThen with MustMatchers {

  feature("Problem One") {

    info("Find the last element of a list.")

    scenario("a function -last- is call on a list") {

      given("a list of Ints")
      val list = List(1, 1, 2, 3, 5, 8)

      when("we ask for the last element")
      val result = new Problem01().last(list)

      then("the last one must be returned")
      result must be === 8
    }
  }
}