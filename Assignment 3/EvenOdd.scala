object EvenOdd extends App{
  def isEven(n:Int):Boolean = n match{
    case 0 => true
    case _ => isOdd(n-1)
  }

  def isOdd(n:Int):Boolean = !(isEven(n))

  println(isEven(4),isEven(5))
  println(isOdd(5),isOdd(6))

}
