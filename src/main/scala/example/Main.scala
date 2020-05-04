object Main extends App {
  private def myAbs(n: Int): Int =
    if (n < 0) -n
    else n

  val num = myAbs(-118)
  println(s"Hello, World! my $num")
}
