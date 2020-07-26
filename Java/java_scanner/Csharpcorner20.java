import java.util.Scanner;    
import static java.lang.System.out;    
        
class Csharpcorner20        
{        
    public static void main(String[] args)    
    {        
        Scanner scan =  new Scanner("CSharpCorner");    
        if(scan.hasNextDouble())    
        {    
            out.println(scan.nextDouble());    
        }    
        scan.close();    
    }        
} 
