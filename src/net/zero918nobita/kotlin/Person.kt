package net.zero918nobita.kotlin

class Person {
  var name = ""
}

fun main(args: Array<String>) {
  val constructor = ::Person
  val taro = constructor()
  taro.name = "Taro"
  println(taro.name)  // => Taro
}
