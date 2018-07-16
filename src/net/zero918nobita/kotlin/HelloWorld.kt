package net.zero918nobita.kotlin

import java.util.Random

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

  println(setOf("abc", "def"))  // => [abc, def]

  run {
    val strs = mutableSetOf("abc", "def")
    strs -= "abc"
    println("strs: $strs")  // => "strs: [def]"
  }

  run {
    val range = 10..15
    println("5 in range: ${5 in range}")    // => false
    println("5 !in range: ${5 !in range}")  // => true
    println("range.reversed.toList(): ${range.reversed().toList()}")  // => [15, 14, 13, 12, 11, 10]

    println("(10 downTo 1 step 2).toList(): ${(10 downTo 1 step 2).toList()}")  // => [10, 8, 6, 4, 2]
  }

  println(when (Random().nextInt(10)) {
    0 -> "zero"
    1 -> "one"
    2 -> "two"
    (1 + 2) -> "three"
    4 -> "four"
    5 -> "five"
    6 -> "six"
    7 -> "seven"
    8 -> "eight"
    9 -> "nine"
    else -> "unknown"
  })

  run {
    var count = 3
    while (count-- > 0) println("Hello")
  }
}
