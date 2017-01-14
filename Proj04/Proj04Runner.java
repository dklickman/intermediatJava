// import the needed libs
import java.io.PrintStream; 
import java.util.ArrayList;
import java.util.Iterator;

class Proj04Runner {
  // initiate
  Proj04Runner() {}
  
  void display(ArrayList arraylist) { 
    System.out.println("David Klickman");
    Object obj; 
    
    for(Iterator iterator = arraylist.iterator(); 
    iterator.hasNext(); 
    System.out.println(obj.getClass())) 
    obj = iterator.next();  
    System.out.println(); 
  }  // end display method
} // end class Proj04Runner 

