package com.dicoding.kotlin

class Animal4(var name: String, var weight: Double, var age: Int, var isMammal: Boolean)

val Animal.getAnimalInfo: String
  get() = "Nama: ${this.name}, Berat: ${this.weight}, Umur: ${this.age} Mamalia: ${this.isMammal}"

fun mainExtensionProperty() {
  val dicodingCat = Animal("Dicoding Miaw", 5.0, 2, true)
  println(dicodingCat.getAnimalInfo)
}