import scala.io.Source._

object Archivos {
  
  
  def lectura(x: Iterator[String]) : Int ={
    var contador :Int=0
    while (x.hasNext) {
      x.next()
      contador=contador+1
    }
    contador
  }
  
  def conteoLLaves(txt : String) : Int ={
    var contador :Int=0
    var a1 :Int=0
    var a2 :Int=0
    for(x <- 0 to (txt.length()-1)){
      
      if(txt.substring(x, x+1).equals("{")){
        a1=a1+1
      }
      if(txt.substring(x, x+1).equals("}")){
        a2=a2+1
      }
    }
    if(a1==0||a2==0){
      contador  
    }else{
      if(a1>a2){
        contador=a2
        contador
      }else if(a2>a1){
        contador=a1
        contador
      }else{
        contador=a1
        contador
      }
      
    }
    
  }
  
  def conteoParentecis(txt : String) : Int ={
    var contador :Int=0
    var a1 :Int=0
    var a2 :Int=0
    for(x <- 0 to (txt.length()-1)){
      
      if(txt.substring(x, x+1).equals("(")){
        a1=a1+1
      }
      if(txt.substring(x, x+1).equals(")")){
        a2=a2+1
      }
    }
    if(a1==0||a2==0){
      contador  
    }else{
      if(a1>a2){
        contador=a2
        contador
      }else if(a2>a1){
        contador=a1
        contador
      }else{
        contador=a1
        contador
      }
      
    }
    
  }
  
  def conteoCorchetes(txt : String) : Int ={
    var contador :Int=0
    var a1 :Int=0
    var a2 :Int=0
    for(x <- 0 to (txt.length()-1)){
      
      if(txt.substring(x, x+1).equals("[")){
        a1=a1+1
      }
      if(txt.substring(x, x+1).equals("]")){
        a2=a2+1
      }
    }
    if(a1==0||a2==0){
      contador  
    }else{
      if(a1>a2){
        contador=a2
        contador
      }else if(a2>a1){
        contador=a1
        contador
      }else{
        contador=a1
        contador
      }
      
    }
    
  }
  
  def main(args: Array[String]): Unit = {
    val source: String = scala.io.Source.fromFile("src/archivo.txt").mkString
    val sour = scala.io.Source.fromFile("src/archivo.txt").getLines()
    println("Lineas de codigo: "+lectura(sour))
    println("LLaves balanceadas: "+conteoLLaves(source))
    println("Parentesis balanceados: "+conteoParentecis(source))
    println("Corchetes balanceados: "+conteoCorchetes(source))
  }
   
}