import java.util.ArrayList; // import the ArrayList class                 
                
public class Csharpcorner20           
{          
  public static void main(String[] args)           
  {   
       ArrayList<String> cars = new ArrayList<String>(capacity); // Create an ArrayList object     
       cars.add("Ford")  ;            
       cars.add("Ferrari");            
       cars.add("Maruti");            
       cars.add("Vokesvagen");     
      
       ArrayList<String> new_cars = new ArrayList<String>();   
    
        // Add values in the boxes list.   
       new_cars.add("Ford");   
       new_cars.add("Ferari");   
       new_cars.add("Mecedes");   
       new_cars.add("Benz");   
  
       new_cars.retainAll(cars);  
   }  
}  
