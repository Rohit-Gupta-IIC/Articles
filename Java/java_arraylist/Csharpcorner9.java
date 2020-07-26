import java.util.ArrayList; // import the ArrayList class                              
  
public class Csharpcorner9           
{          
  public static void main(String[] args)           
  {           
    ArrayList<String> cars = new ArrayList<String>(); // Create an ArrayList object 
    cars.add("Ford")  ;          
    cars.add("Ferrari");          
    cars.add("Maruti");          
    cars.add("Vokesvagen");       
    
    ans=cars.isEmpty();    
    
    if(ans==true)    
            System.out.println("it is empty");    
    else    
            System.out.println("It is not empty");        
   }  
}  
