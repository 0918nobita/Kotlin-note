package sample

fun main(args: Array<String>) {
  println("Hello, world!")
  val half = Rational(1, 2)
  val rat = Rational(1, 3)
  println(half + rat)
  println(half + 2)
  println(2 + half)
}
