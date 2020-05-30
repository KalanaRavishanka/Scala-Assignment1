import scala.io.StdIn.readInt

object Sum extends App{

	def sum(n:Int):Int ={
		if(n==1) 1
		else n+sum(n-1)
	}

	printf("Enter number:");

	var n = readInt();

	println(sum(n));
}
