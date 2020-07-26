import java.util.Scanner;    
import static java.lang.System.out;    
        
class Csharpcorner19        
{        
    public static void main(String[] args)    
    {        
        Scanner scan =  new Scanner("CSharpCorner");    
        if(scan.hasNextByte())    
        {    
            out.println(scan.nextByte());    
        }    
        if(scan.hasNextByte(6))    
        {    
            out.println(scan.nextByte());    
        }    
        scan.close();    
    }        
}   
