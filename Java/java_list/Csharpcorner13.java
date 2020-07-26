import static java.lang.System.out;  
import java.util.*;  
            
class Csharpcorner13            
{            
    public static void main(String[] args)        
    {            
        List list1 = new ArrayList();    
         
        list1.add("Maruti");  
        list1.add("Benz");  
        list1.add(1, "Audi");  
          
        Iterator iterator = list1.listIterator();  
        while(iterator.hasNext())    
        {    
            out.println(iterator.next());    
        }   
          
        Iterator iterator1 = list1.listIterator(1);  
        while(iterator1.hasNext())    
        {    
            out.println(iterator1.next());    
        }   
   }            
} 
