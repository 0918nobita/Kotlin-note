package net.zero918nobita.kotlin

fun succ(i: Int) = i + 1
fun square(i: Int) = i * i
fun hello(name: String) = "Hello, $name!"
fun max(a: Int, b: Int) = if (b <= a) a else b

fun main(args: Array<String>) {
  println(succ(30))  // => 31
  println(square(5))  // => 25
  println(hello("Kotlin"))  // => "Hello, Kotlin"
  println(max(1, 2))  // => 1
}
