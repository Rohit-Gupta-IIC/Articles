import java.util.ArrayList;  
import java.util.List;  
            
class Csharpcorner6            
{            
    public static void main(String[] args)        
    {            
        List list1 = new ArrayList();    
          
        List list2 = new ArrayList();  
          
        list1.add("Maruti");  
        list1.add("Benz");  
        list1.add(1, "Audi");  
          
        list2.add("Wagonar");  
        list2.add("Lambogini");  
          
        list1.equals(list2);  
   }            
}         
