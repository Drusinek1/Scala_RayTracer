package rayTracer

class Sphere(P:List[Double],r:Double) {

  
  
  def dotProd(a:List[Double],b:List[Double]) = {
    
   var sum = 0.0
    for(i <- 0 to 2) {
     sum += a(i)*b(i)     
    }
   sum
  }
  
  def createVect(a:List[Double],b:List[Double]):List[Double] = {
    var newVect = List[Double]()
    for(i <- 0 to 2) {
      newVect = ((b(i)-a(i))) :: newVect
    

    }
      newVect.reverse
    
}
  
  def quadratic(A:Double,B:Double,C:Double):List[Double] = {
    
    val disc = math.sqrt((B*B)-4*(A*C))  // discriminant
    val y = (-B + disc)/(2*A)  //1rst quadratic solution
    val y2 = (-B - disc)/(2*A) //2nd quadratic solution
    val solutions = List(y,y2) 
    solutions // return solutions
  }
  
  
  def intersection(center:List[Double],dir:List[Double],p0:List[Double],radius:Double) = {
    val A = dotProd(dir,dir)
    val vect0 = createVect(center,p0)
    val B = dotProd((dir.map(_*2)),vect0)
    val C = ((dotProd(vect0,vect0))) - (radius*radius)
    val disc = ((B*B)-4*(A*C))
    val solutions = quadratic(A,B,C)
  
    println(solutions)
    
    if(disc < 0) {
      println("vector does not intersect")
    }
    
    if(disc == 0) {
    println("vector intersects once")
    }
    
    if(disc > 0) {
      println("vector intersects twice")
      
  
    }
    
    
      
    
    
  }
   


}
