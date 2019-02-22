


object Calificaciones {
    val parc1 = Array(60,89,90,100,0,56)
    val parc2 = Array(63,95,95,100,70,70)
    val parc3 = Array(85,90,93,95,75,72)
    val parc4 = Array(70,88,89,100,80,85)
  
    var pp1=0.0
    var pp2=0.0
    var pp3=0.0
    var pp4=0.0    
    
    def promedioParcial(){
      var s1=0.0
      var s2=0.0
      var s3=0.0
      var s4=0.0
      for (y<-0 to 5){ 
        s1+=parc1(y)
        s2+=parc2(y)
        s3+=parc3(y)
        s4+=parc4(y)
    }
      pp1=s1/6
      pp2=s2/6
      pp3=s3/6
      pp4=s4/6
      println("Parcial 1: "+pp1)
      println("Parcial 2: "+pp2)
      println("Parcial 3: "+pp3)
      println("Parcial 4: "+pp4+"\n")
      
    }
  
    def promedioMateria():Unit={
      val prom1=(parc1(0)+parc2(0)+parc3(0)+parc4(0))/4
      val prom2=(parc1(1)+parc2(1)+parc3(1)+parc4(1))/4
      val prom3=(parc1(2)+parc2(2)+parc3(2)+parc4(2))/4
      val prom4=(parc1(3)+parc2(3)+parc3(3)+parc4(3))/4
      val prom5=(parc1(4)+parc2(4)+parc3(4)+parc4(4))/4
      val prom6=(parc1(5)+parc2(5)+parc3(5)+parc4(5))/4
      println("Promedio materia 1: "+prom1)
      println("Promedio materia 2: "+prom2)
      println("Promedio materia 3: "+prom3)
      println("Promedio materia 4: "+prom4)
      println("Promedio materia 5: "+prom5)
      println("Promedio materia 6: "+prom6)
    }
  
    def promedioGeneral():Double={
      (pp1+pp2+pp3+pp4)/4
    }
  
    def main(args: Array[String]): Unit = {
      
     promedioParcial()
     println("Promedio general: "+promedioGeneral()+"\n")
     promedioMateria()
    
  }
}