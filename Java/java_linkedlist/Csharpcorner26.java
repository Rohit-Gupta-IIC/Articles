import static java.lang.System.out;  
import java.util.LinkedList;  
  
class Csharpcorner26              
{              
    public static void main(String[] args)          
    {              
        LinkedList<String> l1 = new LinkedList<String>();  
        l1.add("c");  
        l1.add("sharp");  
        l1.add(2,"corner");  
          
        String x = l1.pop();  
        
        out.print(l1);  
    }                
}  
