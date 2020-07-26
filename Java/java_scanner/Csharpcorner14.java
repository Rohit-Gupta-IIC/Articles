import java.util.Scanner;  
import static java.lang.System.out;    
import java.util.regex.Pattern;  
      
class Csharpcorner14      
{      
    public static void main(String[] args)  
    {      
        Scanner scan =  new Scanner("1111, 2222, 33333, 45556");  
        Pattern pattern =  Pattern.compile("[0-9]+");  
        while(scan.hasNext())  
        {  
            out.println(scan.findWithinHorizon(pattern, 18));  
        }  
          
        while(scan.hasNext())  
        {  
            out.println(scan.findWithinHorizon("[0-9]+", 10));  
        }  
        scan.close();  
    }      
}    
