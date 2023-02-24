package com.dicoding.kotlin

interface IFly {
  fun fly()
  val numberOfWings: Int
}

class Bird(override val numberOfWings: Int) : IFly {
  override fun fly() {
    println(
      if (numberOfWings > 0) "Flying with $numberOfWings wings"
      else "I'm flying without wings"
    )
  }
}

fun flyWithWings(bird: IFly) {
  bird.fly()
}

fun mainInterfaces() {
  flyWithWings(Bird(2))
  flyWithWings(Bird(0))

  // Anonymouse class
  flyWithWings(object : IFly {
    override fun fly() {
      if (numberOfWings > 0) "Flying with $numberOfWings wings"
      else "I'm flying without wings"
    }

    override val numberOfWings: Int
      get() = 2
  })
}
