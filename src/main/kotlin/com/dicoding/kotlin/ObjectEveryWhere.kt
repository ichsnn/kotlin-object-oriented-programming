package com.dicoding.kotlin

fun mainObjectEveryWhere() {
  val someString = "Dicoding"
  println(someString.reversed())
  println(someString.toUpperCase())
  println(someString.toLowerCase())

  val someString2 = "123"
  val someInt = someString2.toInt()
  val someString3 = "12.34"
  val someDouble = someString3.toDouble()

  println(someInt)
  println(someDouble)
}