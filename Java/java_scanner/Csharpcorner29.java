import java.util.Scanner;        
import java.util.regex.Pattern;  
import static java.lang.System.out;    
            
class Csharpcorner29            
{            
    public static void main(String[] args)        
    {            
        Scanner scan =  new Scanner("CSharpCorner");     
        out.println(scan.next());  
        String pattern = "[0-9]";  
        out.println(scan.next(pattern));  
        out.println(scan.next(Pattern.compile("[0-9]")));  
    }            
}
