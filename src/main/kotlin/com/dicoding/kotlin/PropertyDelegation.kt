package com.dicoding.kotlin

import kotlin.reflect.KProperty

class DelegateName {
  private var value: String = "Default"

  operator fun getValue(classRef: Any?, property: KProperty<*>): String {
    println("Fungsi ini sama seperti getter untuk properti ${property.name} pada class $classRef")
    return value
  }

  operator fun setValue(classRef: Any?, property: KProperty<*>, newValue: String) {
    println("Fungsi ini sama seperti setter untuk properti ${property.name} pada class $classRef")
    println("Nilai ${property.name} dari: $value akan berubah menjadi $newValue")
    value = newValue
  }
}

class DelegateGenericClass {
  private var value: Any = "Default"

  operator fun getValue(classRef: Any?, property: KProperty<*>): Any {
    println("Fungsi ini sama seperti getter untuk properti ${property.name} pada class $classRef")
    return value
  }

  operator fun setValue(classRef: Any?, property: KProperty<*>, newValue: Any) {
    println("Fungsi ini sama seperti setter untuk properti ${property.name} pada class $classRef")
    println("Nilai ${property.name} dari: $value akan berubah menjadi $newValue")
    value = newValue
  }
}

class Animal3 {
  var name: Any by DelegateGenericClass()
  var weight: Any by DelegateGenericClass()
  var age: Any by DelegateGenericClass()
}

class Person {
  var name: String by DelegateName()
}

class Hero {
  var name: String by DelegateName()
}

fun mainPropertyDelegation() {
  val animal = Animal3()
  animal.name = "Dicoding cat"
  animal.weight = 6.2
  animal.age = 1

  println("Nama: ${animal.name}")
  println("Berat: ${animal.weight}")
  println("Umur: ${animal.age} Tahun")
  println()

  val person = Person()
  person.name = "Dimas"
  println("Nama Orang: ${person.name}")
  println()

  val hero = Hero()
  hero.name = "Gatotkaca"
  println("Nama Pahlawan: ${hero.name}")
  println()
}