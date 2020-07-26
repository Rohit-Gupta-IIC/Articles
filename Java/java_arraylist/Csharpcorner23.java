import java.util.ArrayList; // import the ArrayList class                  
                
public class Csharpcorner23           
{          
  public static void main(String[] args)           
  {   
       ArrayList<String> cars = new ArrayList<String>(); // Create an ArrayList object     
       cars.add("Ford")  ;            
       cars.add("Ferrari");            
       cars.add("Maruti");            
       cars.add("Vokesvagen");     
      
       Spliterator<String> new_cars = cars.spliterator();   
   }  
}  
