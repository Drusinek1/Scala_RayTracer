package rayTracer

object RayTracer {
  
  
  val Sphere = new Sphere(List(1,2,3),4)
  
  def info = {
    println("What kind of shape? Type done when done")
    val answer = readLine()
    if(answer == "Sphere") {
      println("Enter sphere x")
      val sphereX = readDouble()
      println("Enter sphere y")
      val sphereY = readDouble()
      println("Enter sphere z")
      val sphereZ = readDouble()
      println("Enter sphere radius")
      val radius = readDouble()
      val P = sphereX::sphereY::sphereZ::Nil
      val Sphere = new Sphere(P,radius)
      
     
      
      
    }
  }

  

    
 def main(args: Array[String]) {
        Sphere.intersection(List(1,2,-3),List(1,-1,2),List(-2,-3,-2),4)
	}   
}
