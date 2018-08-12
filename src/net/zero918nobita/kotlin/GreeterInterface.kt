package net.zero918nobita.kotlin

interface GreeterInterface {
  fun sayHello()
}

object EnglishGreeter: GreeterInterface {
  override fun sayHello() = println("Hello")
}

fun main(args: Array<String>) {
  val englishGreeter = EnglishGreeter
  englishGreeter.sayHello()
}
