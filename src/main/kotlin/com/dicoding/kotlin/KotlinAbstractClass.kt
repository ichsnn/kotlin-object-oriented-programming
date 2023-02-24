package com.dicoding.kotlin

import java.lang.Error

abstract class Animal11(var name: String, var weight: Double, var age: Int, var isCarnivore: Boolean) {

  fun eat() {
    println("$name sedang makan !")
  }

  fun sleep() {
    println("$name sedang tidur !")
  }
}

fun mainAbstractClass() {
  // val animal = Animal11("dicoding animal", 2.6, 1, true) // Cannot create an instance of an abstract class
}