
object ListMapHigherOrder{
  def main(args:Array[String]) {

    val intList: List[Int] = args.map(_.toInt).toList

    def isPerfectNumber(input: Int) :String  = {
      val check_sum = ( (2 until input).collect  { case x if input % x == 0 => x }  ).sum
      if (input <= 1) "false"
      else if ( check_sum == input - 1 ) "true"
      else "false"
    }

    def myHigherOrderFunction(argFn: Int => String, argVal:List[Int]): List[String] = { argVal.map(argFn) }

    println(myHigherOrderFunction(isPerfectNumber, intList))

  }
}
