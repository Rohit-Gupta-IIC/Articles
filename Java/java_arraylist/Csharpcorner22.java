import java.util.ArrayList; // import the ArrayList class                 
import java.util.Collections.sort() //import the Collections class  
                
public class Csharpcorner22           
{          
  public static void main(String[] args)           
  {   
       ArrayList<String> cars = new ArrayList<String>(); // Create an ArrayList object     
       cars.add("Ford")  ;            
       cars.add("Ferrari");            
       cars.add("Maruti");            
       cars.add("Vokesvagen");     
      
       Collections.sort(cars);  
   }  
} 
