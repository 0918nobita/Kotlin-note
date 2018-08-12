package net.zero918nobita.kotlin

fun succ(i: Int) = i + 1
fun square(i: Int) = i * i

fun hello(name: String = "World") = "Hello, $name!"

fun max(a: Int, b: Int) = if (b <= a) a else b

fun sum(ints: Array<Int>): Int {
  var sum = 0
  for (i in ints) sum += i
  return sum
}

fun sub(minuend: Int, subtrahend: Int) = minuend - subtrahend

fun main(args: Array<String>) {
  println(succ(30))  // => 31
  println(square(5))  // => 25
  println(max(1, 2))  // => 1
  println(sum(arrayOf(1, 2, 3)))  // => 6

  println(sub(minuend = 10, subtrahend = 7))  // => 3
  println(sub(subtrahend = 7, minuend = 10))  // => 3

  println(hello("Kotlin"))  // => "Hello, Kotlin"
  println(hello())  // => "Hello, Kotlin"

  val myFunction = ::succ
  println(myFunction(2))  // => 3
}
