import java.nio.charset.StandardCharsets;    
import java.io.File;    
import java.util.Scanner;    
import static java.lang.System.out;    
      
class Csharpcorner4      
{      
    public static void main(String[] args)     
    {      
      Scanner myObj = new Scanner (System.in, StandardCharsets.US_ASCII.name());    
      out.println("Enter");    
          
      String user = myObj.nextLine();    
      out.print(user);    
    }      
}  
