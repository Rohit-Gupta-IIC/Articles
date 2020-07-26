import static java.lang.System.out;    
import java.util.*;    
              
class Csharpcorner22              
{              
    public static void main(String[] args)          
    {              
        List list1 = new ArrayList();      
           
        list1.add("Maruti");    
        list1.add("Benz");    
        list1.add(1, "Audi");   
          
        List sub = list1.subList(1, 3);  
        out.print(sub);  
   }              
}      

