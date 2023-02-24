package com.dicoding.kotlin

// we need open class for create super or parent class
open class Animal9(val name: String, val weight: Double, val age: Int, val isCarnivore: Boolean) {

  open fun eat() {
    println("$name sedang makan!")
  }

  open fun sleep() {
    println("$name sedang tidur!")
  }
}

class Cat2(
  name: String,
  weight: Double,
  age: Int,
  isCarnivore: Boolean,
  val furColor: String,
  val numberOfFeet: Int
) : Animal9(name, weight, age, isCarnivore) {

  fun playWithHuman() {
    println("$name bermain bersama Manusia !")
  }

  override fun eat() {
    println("$name sedang memakan ikan !")
  }

  override fun sleep() {
    println("$name sedang tidur di bantal !")
  }
}

fun mainKotlinInheritances() {
  val dicodingCat = Cat2("Dicoding Miaw", 3.2, 2, true, "Brown", 4)

  dicodingCat.playWithHuman()
  dicodingCat.eat()
  dicodingCat.sleep()
}