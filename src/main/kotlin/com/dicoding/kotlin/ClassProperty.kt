package com.dicoding.kotlin

class Animal2 {
  var name = "Dicoding Miaw!"
    get() {
      println("Fungsi Getter Terpanggil")
      return field
    }
    set(value) {
      println("Fungsi Setter Terpanggil")
      field = value
    }
}

fun mainClassProperty() {
  val dicodingCat = Animal2()
  println("Nama : ${dicodingCat.name}")
  dicodingCat.name = "Goose"
  println("Nama : ${dicodingCat.name}")
  /*
  output:
  Fungsi Getter terpanggil
  Nama: Dicoding Miaw
  Fungsi Setter terpanggil
  Fungsi Getter terpanggil
  Nama: Goose
  */
}

