package net.zero918nobita.kotlin

interface GreeterInterface {
  fun sayHello()
}

class EnglishGreeter: GreeterInterface {
  override fun sayHello() = println("Hello")
}

fun main(args: Array<String>) {
  val greeter1 = EnglishGreeter()
  greeter1.sayHello()

  val greeter2 = EnglishGreeter()
  greeter2.sayHello()
}
