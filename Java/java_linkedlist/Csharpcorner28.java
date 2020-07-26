import static java.lang.System.out;  
import java.util.LinkedList;  
  
class Csharpcorner28              
{              
    public static void main(String[] args)          
    {              
        LinkedList<String> l1 = new LinkedList<String>();  
        l1.add("c");  
        l1.add("sharp");  
        l1.add(2,"corner");  
          
        l1.remove();  
        out.print(l1);  
          
        l1.remove(0);  
        out.print(l1);  
          
        l1.remove("corner");  
        out.print(l1);  
    }                
} 
