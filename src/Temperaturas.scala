
import scala.collection.mutable.ArrayBuffer


object Temperaturas {
  val temperaturas = ArrayBuffer[Int]()
  val temp25 = ArrayBuffer[Int]()
  val r = scala.util.Random
  
  
  def llenarArreglo(){
    
    for (x<-0 until (47, 2)){
      temperaturas+=x/2
      temperaturas+=r.nextInt(50)
    }
    println(temperaturas)
  }
  def temperatura(){
    for(x<-0 until 48){
      if(temperaturas(x)==25){
        println("Hora: "+temperaturas(x-1)+" Temperatura: "+temperaturas(x))
        temp25+=temperaturas(x-1)
        temp25+=temperaturas(x)
      }
    }
    println(temp25)
  }
  def main(args: Array[String]): Unit = {
    llenarArreglo()
    temperatura()
  }
}