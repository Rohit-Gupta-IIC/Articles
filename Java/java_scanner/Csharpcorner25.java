import java.util.Scanner;   
import static java.lang.System.out;    
            
class Csharpcorner25            
{            
    public static void main(String[] args)        
    {            
        Scanner scan =  new Scanner("CSharpCorner");        
        if(scan.hasNextShort())        
        {        
            out.println(scan.nextShort());        
        }        
        if(scan.hasNextShort(6))        
        {        
            out.println(scan.nextShort());        
        }        
        scan.close();        
    }            
}       
