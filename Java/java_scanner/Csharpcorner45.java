import java.util.Scanner;        
import java.util.regex.Pattern;  
import static java.lang.System.out;    
            
class Csharpcorner45            
{            
    public static void main(String[] args)        
    {            
        Scanner scan =  new Scanner("CSharpCorner").useDelimiter(Pattern.compile("\\s*\\s"));     
        out.println(scan.delimiter());  
          
        Scanner scan1 =  new Scanner("CSharpCorner").useDelimiter("\n");     
        out.println(scan1.delimiter());  
   }            
}  
