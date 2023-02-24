package com.dicoding.kotlin

fun mainExceptionHandling() {
  // try-catch
  val someNullValue: String? = null
  lateinit var someMustNotNullValue: String

  try {
    someMustNotNullValue = someNullValue!!
    println(someMustNotNullValue)
  } catch (e: Exception) {
    someMustNotNullValue = "Nilai String Null"
    println(someMustNotNullValue)
  }

  // try-catch-finally
  val someNullValue1: String? = null
  lateinit var someMustNotNullValue1: String

  try {
    someMustNotNullValue1 = someNullValue1!!
  } catch (e: Exception) {
    someMustNotNullValue1 = "Nilai String Null"
  } finally {
    println(someMustNotNullValue1)
  }

  // multiple catch
  val someStringValue2: String? = null
  var someIntValue1: Int = 0

  try {
    someIntValue1 = someStringValue2!!.toInt()
  } catch (e: NullPointerException) {
    someIntValue1 = 0
  } catch (e: NumberFormatException) {
    someIntValue1 = -1
  } finally {
    when(someIntValue1){
      0 -> println("Catch block NullPointerException terpanggil !")
      -1 -> println("Catch block NumberFormatException terpanggil !")
      else -> println(someIntValue1)
    }
  }
}