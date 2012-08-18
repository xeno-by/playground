import Foobzie._

object Test extends App {
  val y = 2
  foo()
  val x = foobzie(y)
  val z = Qwe.hello
  println(x)

  def foo() = {
    val a = 10
    val b = a * a
    println(b)
  }
}
