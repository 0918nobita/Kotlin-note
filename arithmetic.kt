import java.util.Scanner

fun main(args: Array<String>) {
  val scanner = Scanner(System.`in`)
  val sa = scanner.next()
  val sb = scanner.next()
  val a = Integer.parseInt(sa)
  val b = Integer.parseInt(sb)
  val c = a + b
  val d = c / 2
  println("${d}")
}
