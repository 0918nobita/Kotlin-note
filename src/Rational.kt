package sample

// プライマリコンストラクタ
class Rational(n: Int, d: Int) {
  // セカンダリコンストラクタ
  init {
    require(d != 0, {"denominator must not be null"})
  }

  private val g = gcd(Math.abs(n), Math.abs(d))

  private val numerator: Int = n / g
  private val denominator: Int = n / g

  override fun toString(): String = "$numerator/$denominator"

  // tailrec: 末尾再帰
  private tailrec fun gcd(a: Int, b: Int): Int =
    if (b == 0) a
    else gcd(b, a % b)
}
