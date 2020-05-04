import java.lang.Math

object Main extends App {
  private def myAbs(n: Int): Int =
    if (n < 0) -n
    else n

  val num1 = myAbs(-118)
  val num2 = Math.abs(-119)

  val s1 = s"num1=$num1"
  val s2 = s"num2=$num2"
  println("Hello, World: " + s1 + ", " + s2)
}
