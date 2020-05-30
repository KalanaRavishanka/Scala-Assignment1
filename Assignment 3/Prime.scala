import scala.io.StdIn.readInt

object Prime extends App{

  def gcd(x:Int,y:Int):Int = y match{
    case 0 => x
    case y if(y>x) => gcd(y,x)
    case _ => gcd(y,x%y)
  }

  def prime(p:Int, n:Int=2) : Boolean = n match{
    case x if(p==x) => true
    case x if(gcd(p,x)>1) => true
    case x => prime(p,x+1)
  }

  printf("Enter your number:");

  var p = readInt();

  println(prime(p))

}

