

// pass in using generic object type 
public class Proj02Runner<A1,A2>{
  private A1 a1;
  private A2 a2;
  
  public Proj02Runner(A1 a1,A2 a2){
    this.a1 = a1;
    this.a2 = a2;
  }
  
  public A1 get1(){
    System.out.println("David Klickman");
    return a1;
  }
  
  public A2 get2(){
    return a2;
  }//end get2 method 
//}//end Proj02Runner method 
}//end class Proj02Runner 