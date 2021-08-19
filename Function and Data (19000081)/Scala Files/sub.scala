object sub extends App {
  val x = new Rational(3,4)
  val y = new Rational(5,8)
  val z = new Rational(2,7)
  val result = x - y - z
  println(result)
}

class Rational(n:Int,d:Int){
  def num = n/gcd(n,d)
  def den = d/gcd(n,d)


  private def gcd(a:Int, b:Int):Int = if(b == 0) a else gcd(b,a%b)
  def neg = new Rational(-this.num, this.den)

  def +(r:Rational) = new Rational(r.num * this.den + this.num * r.den, this.den * r.den)

  def -(r:Rational) = this + r.neg

  override def toString = num + "/" + den
}
