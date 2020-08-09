object PointAssi extends App{
    val p1 = Point(4,2)
    val p2 = Point(3,9)
    val p3 = p1.move(1,3)
    val p4 = p1.InvertOfpoint(p1)
    val p5 = p1 - p2
    val p6 = p5.DisOfpoints(p5)


    println(p1)
    println(p2)
    println(p1+p2)
    println(p3)
    
    println(p6)

    println(p4)
    
}

case class Point(a:Int,b:Int){
    def x:Int = a
    def y:Int = b

    def +(that:Point)=Point(this.x+that.x,this.y+that.y)

    def move(dx:Int,dy:Int) = Point(this.x+dx,this.y+dy)

    

    def -(that:Point)=Point(this.x-that.x,this.y-that.y)

    def DisOfpoints(that:Point):Double={
        val distance = math.sqrt((this.x)*(this.x) + (this.y)*(this.y))
        return distance
    }

    def InvertOfpoint(that:Point)=Point(this.y,this.x)


}