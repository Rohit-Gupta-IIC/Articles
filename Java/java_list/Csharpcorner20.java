import static java.lang.System.out;    
import java.util.*;    
              
class Csharpcorner20              
{              
    public static void main(String[] args)          
    {              
        List list1 = new ArrayList();      
           
        list1.add("Maruti");    
        list1.add("Benz");    
        list1.add(1, "Audi");   
          
        Comparator<String> com = Collections.reverseOrder();  
          
        list1.sort(com);  
        out.print(list1);  
   }              
}   
