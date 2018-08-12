package net.zero918nobita.kotlin

class Person(n: String) {
  var name: String = n
}

fun main(args: Array<String>) {
  val constructor = ::Person
  val taro = constructor("Taro")
  println(taro.name)  // => Taro
}
