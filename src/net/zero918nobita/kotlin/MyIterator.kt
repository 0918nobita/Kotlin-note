package net.zero918nobita.kotlin

class MyIterator {
  operator fun hasNext() = Math.random() < 0.5
  operator fun next() = "x"
}

class MyIterable {
  operator fun iterator() = MyIterator()
}
