package rayTracer

class Vector(x:Double,y:Double,z:Double,d1:Double,d2:Double,d3:Double)  {

  def vectInfo() = {
    
    var vector = List[Double]()
    println("enter vector coordinates")
    println("enter x")
    val vectx = readDouble()
    println("enter y") 
    val vecty = readDouble()
    println("enter z")
    val vectz = readDouble()
    
    println("Enter direction vetor coorinates")
    println("Enter i")
    val i = readDouble()
    println("Enter j")
    val j = readDouble()
    println("Enter k")
    val k = readDouble()
   
   vector = k::j::i::vector 
   
   vector
  }
  
}
