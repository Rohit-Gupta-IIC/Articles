import java.util.Scanner;  
import java.util.regex.Pattern;  
import static java.lang.System.out;    
      
class Csharpcorner13      
{      
    public static void main(String[] args)  
    {      
        Scanner scan =  new Scanner("CsharpCorner");  
        out.println(scan.findInLine("sharp"));  
          
        out.println(scan.findInLine(Pattern.compile("sharp")));  
        scan.close();  
    }      
} 
