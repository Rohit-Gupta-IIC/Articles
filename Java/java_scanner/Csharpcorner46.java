import java.util.Locale;  
import java.util.Scanner;     
import static java.lang.System.out;    
            
class Csharpcorner46            
{            
    public static void main(String[] args)        
    {            
        Scanner scan =  new Scanner("CSharpCorner").useLocale(Locale.ITALY);     
        out.println(scan.locale());  
         
   }            
}
