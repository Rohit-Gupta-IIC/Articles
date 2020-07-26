import static java.lang.System.out;  
import java.util.*;  
import java.util.function.UnaryOperator;  
  
class MyOperator implements UnaryOperator<String>  
{  
    @Override  
    public String apply(String t) {  
        return t.toLowerCase();  
    }  
}  
            
class Csharpcorner16            
{            
    public static void main(String[] args)        
    {            
        List list1 = new ArrayList();    
         
        list1.add("Maruti");  
        list1.add("Benz");  
        list1.add(1, "Audi");  
          
        list1.replaceAll(new MyOperator());  
   }            
}         
