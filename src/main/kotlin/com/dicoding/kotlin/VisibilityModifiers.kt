package com.dicoding.kotlin

import javax.naming.Name

// public, private, protected, internal

open class Animal8(
  private var name: String,
  private val weight: Double,
  private val age: Int,
  private val isMammal: Boolean
) {
  fun getName(): String {
    return name;
  }

  fun setName(name: String) {
    this.name = name
  }
}

class Cat(name: String, weight: Double, age: Int, isMammal: Boolean) : Animal8(name, weight, age, isMammal)

// we can't call this Class on other module
internal class Dog(val name: String)

fun mainVisibilityModifiers() {
  val dicodingCat = Animal8("Dicoding Miaw", 2.5, 2, true)
  // it can be called
  // println("Nama: ${dicodingCat.name}, Berat: ${dicodingCat.weight}, Umur: ${dicodingCat.age}, mamalia: ${dicodingCat.isMammal}")
  println(dicodingCat.getName())
  dicodingCat.setName("Gooose")
  println(dicodingCat.getName())

  val cat = Cat("Dicoding Miaw", 2.5, 2, true)
  // println("Nama Kucing: ${cat.name}")
  // println("Berat Kucing: ${cat.weight}") //Cannot access 'weight': it is protected in 'Cat'
}