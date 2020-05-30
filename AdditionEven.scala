import scala.io.StdIn.readInt

object AdditionEven extends App{

	def even(n:Int):Boolean ={
		if(n%2) print(even(n))
	}

	def addeven(n:Int):Int ={
		n+addeven(even(n))
	}

	printf("Enter Number");

	var n = readInt;

}
