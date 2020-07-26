import static java.lang.System.out;  
import java.util.*;  
            
class Csharpcorner15            
{            
    public static void main(String[] args)        
    {            
        List list1 = new ArrayList();    
         
        list1.add("Maruti");  
        list1.add("Benz");  
        list1.add(1, "Audi");  
          
        List list2 = new ArrayList();    
         
        list2.add("Maruti");  
        list1.add("Benz");  
          
        list1.removeAll(list2);  
   }            
}   
