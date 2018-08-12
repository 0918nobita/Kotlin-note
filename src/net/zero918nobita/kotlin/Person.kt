package net.zero918nobita.kotlin

open class Person(private val name: String) {
  open fun show() = println(name)
}

class Student(private val id: Long,
              private val name: String): Person(name) {
  override fun show() = println("Student(id=$id, name=$name)")

  val initial: Char
    get() = name[0]
}

fun main(args: Array<String>) {
  val constructor = ::Person
  val taro = constructor("Taro")
  taro.show()  // => Taro

  val student = Student(123, "Tom")
  student.show()  // => "Student(id=123, name=Tom)"
  println(student.initial)  // => T
}
