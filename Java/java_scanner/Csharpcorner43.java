import java.util.Scanner;        
import java.util.regex.Pattern;  
import static java.lang.System.out;    
            
class Csharpcorner43            
{            
    public static void main(String[] args)        
    {            
        Scanner scan =  new Scanner("CSharpCorner");     
        out.println(scan.next());  
        String pattern = "[A-Z]*";  
        while(scan.hasNext())  
        {  
            scan.skip(pattern);  
            out.println(scan.next());  
        }  
        Scanner scan1 =  new Scanner("CSharpCorner");    
        scan1.skip(Pattern.compile("...ar"));  
        out.println(scan1.nextLine());  
   }            
} 
