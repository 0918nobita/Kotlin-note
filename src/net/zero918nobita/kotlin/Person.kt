package net.zero918nobita.kotlin

class Person(private val name: String) {
  fun show() = println(name)
}

fun main(args: Array<String>) {
  val constructor = ::Person
  val taro = constructor("Taro")
  taro.show()  // => Taro
}
