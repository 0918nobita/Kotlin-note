package net.zero918nobita.kotlin

data class User(val id: Long, val name: String)

fun main(args: Array<String>) {
  val john = User(42, "John")
  println(john.id)
  println(john.name)
}
