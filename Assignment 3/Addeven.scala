import scala.io.StdIn.readInt

object Addeven extends App{

	def sumofeven(x:Int):Int={
		x match{
			case 0 => x
			case _ => 2*x - sumofeven(x-1)
		}

	}

	printf("Enter Number:");

	var x = readInt();

	println(sumofeven(x))

	
}
