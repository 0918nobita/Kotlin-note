package net.zero918nobita.kotlin

fun Int.isOdd(): Boolean = this % 2 == 0

fun main(args: Array<String>) {
  println(5.isOdd())
  println(6.isOdd())
}
