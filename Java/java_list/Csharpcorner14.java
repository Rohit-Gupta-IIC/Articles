import static java.lang.System.out;  
import java.util.*;  
            
class Csharpcorner            
{            
    public static void main(String[] args)        
    {            
        List list1 = new ArrayList();    
         
        list1.add("Maruti");  
        list1.add("Benz");  
        list1.add(1, "Audi");  
          
        list1.remove(1);  
        out.println(list1);  
          
        list1.remove("Benz");  
        out.println(list1);  
   }            
} 
