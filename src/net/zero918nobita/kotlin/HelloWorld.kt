package net.zero918nobita.kotlin

fun main(args: Array<String>) {
  val half = Rational(1, 2)
  val oneThird = Rational(1, 3)

  println(half + oneThird)  // => "5/6"
  println(half + 2)         // => "5/2"
  println(2 + half)         // => "5/2"

  run {
    val ints = arrayOfNulls<Int>(5)
    println("ints[0]: ${ints[0]}")      // => "ints[0]: null"
    println("ints.size: ${ints.size}")  // => "ints.size: 5"

    ints[0] = 123
    println("ints[0]: ${ints[0]}")  // => "ints[0]: 123"
  }

  println(arrayOf("ab", "cd", "ef")[1])  // => cd

  println(intArrayOf(1, 2, 3)[2])           // => 3
  println(doubleArrayOf(1.0, 2.0, 3.0)[0])  // => 1.0
  println(charArrayOf('a', 'b', 'c')[1])    // => b

  run {
    val ints = listOf(1, 2, 3)
    println("ints: $ints")  // => "ints: [1, 2, 3]"
    println("ints.size: ${ints.size}")  // => "ints.size: 3"
    println("ints[2]: ${ints[2]}")      // => "ints[2]: 3"
  }

  run {
    val chars = mutableListOf('a', 'b')
    chars[0] = 'c'
    println("chars: $chars")  // => "chars: [c, b]"
    chars += 'a'
    println("chars: $chars")  // => "chars: [c, b, a]"
    chars -= 'b'
    println("chars: $chars")  // => "chars: [c, a]"
  }
}
