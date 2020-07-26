import static java.lang.System.out;  
import java.util.LinkedList;  
  
class Csharpcorner19              
{              
    public static void main(String[] args)          
    {              
        LinkedList<String> l1 = new LinkedList<String>();  
        l1.add("c");  
        l1.add("sharp");  
        l1.add(2,"corner");  
          
        boolean x = l1.offerLast("c");  
        
        out.print(l1);  
    }                
}  
