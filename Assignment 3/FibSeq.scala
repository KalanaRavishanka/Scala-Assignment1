import scala.io.StdIn.readInt
object FibSeq extends App{
	
	printf("Enter Number:");
	var n = readInt();

	def fib(n:Int):Int = n match{
		case n if n==0 => 0
		case n if n==1 => 1
		case n => fib(n-1) + fib(n-2)
	}

	def fibseq(n:Int):Any = {
		if(n>0) fibseq(n-1)
		println(fib(n))
	}

	println(fibseq(n));
}
