package net.zero918nobita.kotlin

interface Greeter2 {
  val name: String
  fun introduceMyself()
  fun sayHello()
}

class EnglishGreeter2(override val name: String): Greeter2 {
  override fun introduceMyself() = println("My name is $name.")

  override fun sayHello() = println("Hello!")
}

/*class CountingGreeter(private val greeter: Greeter2): Greeter2 {
  var helloCount: Int = 0
    private set

  override val name: String
    get() = greeter.name

  override fun introduceMyself() = greeter.introduceMyself()

  override fun sayHello() {
    helloCount++
    greeter.sayHello()
  }
}*/

class CountingGreeter(private val greeter: Greeter2): Greeter2 by greeter {
  var helloCount = 0
    private set

  override fun sayHello() {
    helloCount++
    greeter.sayHello()
  }
}

fun main(args: Array<String>) {
  val countingGreeter = CountingGreeter(EnglishGreeter2("Tom"))
  countingGreeter.sayHello()
  countingGreeter.sayHello()
  countingGreeter.sayHello()
  countingGreeter.introduceMyself()
  println(countingGreeter.helloCount)
}
