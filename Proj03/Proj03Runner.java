import java.awt.Component;
import java.io.PrintStream;


class Proj03Runner<T1>{
  
  public Proj03Runner(Component component) { 
    t = component;
    
    System.out.println("David Klickman");
    }
  
  public void runIt() { 
    System.out.println(t.getClass());
    }
  Component t;
}
