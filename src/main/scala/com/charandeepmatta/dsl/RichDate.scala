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

import org.joda.time.DateTime

class RichDate(var dateTime: DateTime) {
  import RichDate.Conjunction

  private var last = 0

  def plus(num: Int) = { last = num; this }
  def minus(num: Int) = { last = -num; this }
  def +(num: Int) = plus(num)
  def -(num: Int) = minus(num)

  def days = { dateTime = dateTime.plusDays(last); this }
  def day = days
  def days(and: Conjunction): RichDate = days
  def day(and: Conjunction): RichDate = days

  def months = { dateTime = dateTime.plusMonths(last); this }
  def month = months
  def months(and: Conjunction): RichDate = months
  def month(and: Conjunction): RichDate = month

  def years = { dateTime = dateTime.plusYears(last); this }
  def year = years
  def years(and: Conjunction): RichDate = years
  def year(and: Conjunction): RichDate = years

  override def toString = dateTime.toString
}

object RichDate {
  class Conjunction

  val and = new Conjunction

  def Now = new DateTime

  implicit def toRichDate(dateTime: DateTime) = new RichDate(dateTime)
  implicit def toDateTime(richDate: RichDate) = richDate.dateTime
}