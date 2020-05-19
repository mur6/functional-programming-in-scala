case class TwoNumbers(num1: Integer, num2: Integer) {
  val absInteger1 = Math.abs(num1)
  val absInteger2 = Math.abs(num2)

  val s1 = s"abs1=$absInteger1"
  val s2 = s"abs2=$absInteger2"
}

object Main extends App {
//   private def myAbs(n: Int): Int =
//     if (n < 0) -n
//     else n
  val nums = TwoNumbers(-100, -321)
  println("Hello, World.")
  println("TwoNumbers[1] = " + nums.s1)
  println("TwoNumbers[2] = " + nums.s2)
}
