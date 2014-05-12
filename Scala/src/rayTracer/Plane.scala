package rayTracer

class Plane(x:Double,y:Double,z:Double,Ni:Double,Nj:Double,Nk:Double) {

  
   
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
	
	def numerator(l0:List[Double],l:List[Double]) = {
	  val P0 = List(x,y,z) // initial point on plane
	  val PL = createVect(l0,P0) // Vector PL between point on plane and line
	  val n = List(Ni,Nj,Nk) // Normal vector of plane
	  val numerator = dotProd(PL,n) 
	  val denominator = dotProd(l,n)
	  val d = numerator/denominator 
	  
	}

  
 }
  
  