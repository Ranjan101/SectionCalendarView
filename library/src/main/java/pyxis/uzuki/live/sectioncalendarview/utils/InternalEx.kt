@file:JvmName("InternalEx")
@file:JvmMultifileClass

package pyxis.uzuki.live.sectioncalendarview.utils

import pyxis.uzuki.live.richutilskt.utils.toDateString

/**
 * SectionCalendarView
 * Class: InternalEx
 * Created by Pyxis on 2017-12-20.
 *
 * Description:
 */
fun assignPad10(number: Int) = if (number < 10) number.toString().padStart(2, '0') else number.toString()

fun compareDayEqual(a: String, b: String) = compareEqual(a.toDateString("yyyy.MM.dd", "yyyyMMdd"), b)

fun compareDayGreatEqaul(a: String, b: String) = compareGreaterEqual(a.toDateString("yyyy.MM.dd", "yyyyMMdd"), b)

fun compareDayLessEqaul(a: String, b: String) = compareLessEqual(a.toDateString("yyyy.MM.dd", "yyyyMMdd"), b)