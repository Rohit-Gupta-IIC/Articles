import java.util.ArrayList; // impo rt the ArrayList class                 
                
public class Csharpcorner26           
{          
  public static void main(String[] args)           
  {   
       int capacity=20;  
       ArrayList<String> cars = new ArrayList<String>(capacity); // Create an ArrayList object     
       cars.add("Ford")  ;            
       cars.add("Ferrari");            
       cars.add("Maruti");            
       cars.add("Vokesvagen");     
      
       cars.trimToSize();   
   }  
} 
