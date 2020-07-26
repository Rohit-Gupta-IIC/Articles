import static java.lang.System.out;  
import java.util.ArrayList;  
import java.util.LinkedList;  
  
class Csharpcorner1              
{              
    public static void main(String[] args)          
    {              
        ArrayList<String> l1 = new ArrayList<String>();  
        l1.add("c");  
        l1.add("sahrp");  
          
        LinkedList<String> l2 = new LinkedList<String>(l1);  
          
        out.print(l2);  
    }                
}  
