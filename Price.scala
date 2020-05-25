import scala.io.StdIn.readInt
object Price extends App{
	def attendees(p:Int)= 120 + (15-p)/5*20;

	def revenue(p:Int)=p*attendees(p);

	def perfomancecost(p:Int)= 500 + 3*attendees(p);

	def profit(p:Int)= revenue(p) - perfomancecost(p);

	printf("Enter a ticket price:");

	var p = readInt();

	println(profit(p));

	

}
