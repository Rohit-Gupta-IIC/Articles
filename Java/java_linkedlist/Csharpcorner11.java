import static java.lang.System.out;  
import java.util.LinkedList;  
  
class Csharpcorner11              
{              
    public static void main(String[] args)          
    {              
        LinkedList<String> l1 = new LinkedList<String>();  
        l1.add("c");  
        l1.add("sharp");  
        l1.add(2,"corner");  
          
        String x = l1.get(2);  
        
        out.print(x);  
    }                
}   
