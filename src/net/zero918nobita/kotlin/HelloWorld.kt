package net.zero918nobita.kotlin

fun main(args: Array<String>) {
  val half = Rational(1, 2)
  val oneThird = Rational(1, 3)

  println(half + oneThird)  // => "5/6"
  println(half + 2)         // => "5/2"
  println(2 + half)         // => "5/2"
}
