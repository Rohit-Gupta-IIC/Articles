import static java.lang.System.out;  
import java.util.LinkedList;  
  
class Csharpcorner33              
{              
    public static void main(String[] args)          
    {              
        LinkedList<String> l1 = new LinkedList<String>();  
        l1.add("c");  
        l1.add("sharp");  
        l1.add(2,"corner");  
          
        l1.set(1, ".com");  
          
        out.print(l1);  
    }                
} 
