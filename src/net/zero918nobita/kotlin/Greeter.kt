package net.zero918nobita.kotlin

abstract class Greeter {
  open fun sayHello() = println("Hello")
  abstract fun sayGoodBye()
}

class JapaneseGreeter: Greeter() {
  override fun sayHello() = println("こんにちは")
  override fun sayGoodBye() = println("さようなら")
}

fun main(args: Array<String>) {
  val jpGreeter = JapaneseGreeter()
  jpGreeter.sayHello()
  jpGreeter.sayGoodBye()
}
