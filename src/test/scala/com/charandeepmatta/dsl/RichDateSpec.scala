/**
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */
package com.charandeepmatta.dsl

import com.charandeepmatta.dsl.RichDate._
import org.joda.time.DateTime
import org.joda.time.DateTimeUtils
import org.scalatest.BeforeAndAfter
import org.scalatest.FunSpec
import org.scalatest.matchers.ShouldMatchers

class RichDateSpec extends FunSpec with BeforeAndAfter with ShouldMatchers {

  val fixed = new DateTime(2012, 7, 23, 9, 9, 9, 9)

  before {
    DateTimeUtils.setCurrentMillisFixed(fixed.getMillis)
  }

  after {
    DateTimeUtils.currentTimeMillis()
  }

  describe("Working with dates") {
    it("becomes easier with dsl") {
      (Now + 1 month and plus 1 day).dateTime should equal (new DateTime().plusMonths(1).plusDays(1))
    }
  }
}

