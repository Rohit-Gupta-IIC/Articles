import java.util.ArrayList; // import the ArrayList class                 
  
import java.util.function.*;  
  
class MyOperator<T> implements UnaryOperator<T>  
{  
    T varc1;  
    public T apply(T varc)  
    {  
        return varc1;  
    }  
}  
                
public class Csharpcorner19           
{          
  public static void main(String[] args)           
  {  
    ArrayList<String> cars = new ArrayList<String>(); // Create an ArrayList object           
    MyOperator<String> operator;  
    
    operator = new MyOperator<> ();  
      
    cars.add("Ford")  ;          
    cars.add("Ferrari");          
    cars.add("Maruti");          
    cars.add("Vokesvagen");       
    
    operator.varc1 = "Ambassodor";  
      
    cars.replaceAll(operator);  
   }  
}  
