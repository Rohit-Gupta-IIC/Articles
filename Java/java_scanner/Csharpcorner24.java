import java.util.Scanner;   
import static java.lang.System.out;    
            
class Csharpcorner24            
{            
    public static void main(String[] args)        
    {            
        Scanner scan =  new Scanner("CSharpCorner");        
        if(scan.hasNextLong())        
        {        
            out.println(scan.nextLong());        
        }        
        if(scan.hasNextLong(6))        
        {        
            out.println(scan.nextLong());        
        }        
        scan.close();        
    }            
}  
