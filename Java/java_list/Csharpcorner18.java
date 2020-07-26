import static java.lang.System.out;    
import java.util.*;    
              
class Csharpcorner18              
{              
    public static void main(String[] args)          
    {              
        List list1 = new ArrayList();      
           
        list1.add("Maruti");    
        list1.add("Benz");    
        list1.add(1, "Audi");    
            
        list1.set(1, "Alto");  
          
        out.print(list1);  
   }              
} 
