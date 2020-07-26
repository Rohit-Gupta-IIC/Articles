import java.util.Scanner;        
import static java.lang.System.out;    
            
class Csharpcorner28            
{            
    public static void main(String[] args)        
    {            
        Scanner scan =  new Scanner("CSharpCorner");     
        out.print(scan.hasNext("Csharp"));  
        out.println(scan.match());   
    }            
}   
