package net.zero918nobita.kotlin

fun main(args: Array<String>) {
  // val foo: String = null  // Type Error

  // val foo: String? = null  // OK
  // println(foo!!.length)  // NullPointerException

  val ints: List<Int> = mutableListOf(1, 2, 3)

  // if (ints is MutableList<Int>) (ints as MutableList<Int>).add(4)
  if (ints is MutableList<Int>) {
    ints.add(4)
  }
  println(ints)  // => [1, 2, 3, 4]

  val bar: String? = "Hello"
  println(bar?.toUpperCase())  // => Hello

  val baz: String? = null
  println(baz?.toUpperCase() ?: "default")  // => default
}
