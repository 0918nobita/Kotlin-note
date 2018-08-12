package net.zero918nobita.kotlin

class Person(val name: String)

fun main(args: Array<String>) {
  val constructor = ::Person
  val taro = constructor("Taro")
  println(taro.name)  // => Taro
}
