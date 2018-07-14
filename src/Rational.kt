package sample

// プライマリコンストラクタ
class Rational(private val numerator: Int,
               private val denominator: Int) {
  override fun toString(): String = "$numerator/$denominator"
}
