package net.zero918nobita.kotlin

interface Greeter2 {
  val name: String
  fun introduceMyself()
  fun sayHello()
}

class EnglishGreeter2(override val name: String): Greeter2 {
  override fun introduceMyself() {
    sayHello()
    println("My name is $name.")
  }

  override fun sayHello() = println("Hello!")
}
