package com.dicoding.kotlin

import kotlin.random.Random

// import kotlin.math.PI
// import kotlin.math.cos as cosinus
// import kotlin.math.sqrt as akar

import kotlin.math.*

fun mainImportPackage() {
  val someInt = Random(0).nextInt(1, 10)
  println(someInt)

  // println(PI)
  // println(cosinus(120.0))
  // println(akar(9.0))

  println(PI)
  println(cos(120.0))
  println(sqrt(9.0))
}
