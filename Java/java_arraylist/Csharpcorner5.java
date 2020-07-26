import java.util.ArrayList; // import the ArrayList class             
    
public class Csharpcorner5       
{      
  public static void main(String[] args)       
  {      
    ArrayList<String> cars = new ArrayList<String>(); // Create an ArrayList object            
        
    cars.add("Ford")  ;      
    cars.add("Ferrari");      
    cars.add("Maruti");      
    cars.add("Vokesvagen");      
      
    ArrayList<String> new_cars = new ArrayList<String>();    
      
    new_cars.add("Bukati");      
      
    new_cars.addAll(cars);  
   }  
}    
