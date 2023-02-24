package com.dicoding.kotlin

class Animal6(name: String, weight: Double, age: Int) {
  val name: String
  val weight: Double
  val age: Int
  var isMammal: Boolean

  init {
    this.weight = if (weight < 0) 0.1 else weight
    this.age = if (age < 0) 0 else age
    this.name = name
    this.isMammal = false
  }

  constructor(name: String, weight: Double, age: Int, isMammal: Boolean) : this(name, weight, age) {
    this.isMammal = isMammal
  }
}

// Default Constructor
class Animal7 {
  val name: String = "Dicoding Miaw"
  val weight: Double = 4.2
  val age: Int = 2
  val isMammal: Boolean = true
}

fun mainSecondaryConstructor() {
  val dicodingCat = Animal6("Dicoding Miaw", 2.5, 2, true)
  println("Nama: ${dicodingCat.name}, Berat: ${dicodingCat.weight}, Umur: ${dicodingCat.age}, mamalia: ${dicodingCat.isMammal}")

  val dicodingBird = Animal6("Dicoding tweet", 0.5, 1)
  println("Nama: ${dicodingBird.name}, Berat: ${dicodingBird.weight}, Umur: ${dicodingBird.age}, mamalia: ${dicodingBird.isMammal}")

  val dicodingCat1 = Animal7()
  println("Nama: ${dicodingCat.name}, Berat: ${dicodingCat.weight}, Umur: ${dicodingCat.age}, mamalia: ${dicodingCat.isMammal}")
}