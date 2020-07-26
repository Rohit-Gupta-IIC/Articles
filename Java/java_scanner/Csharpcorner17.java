import java.util.Scanner;  
import static java.lang.System.out;    
      
class Csharpcorner17      
{      
    public static void main(String[] args)  
    {      
        Scanner scan =  new Scanner("CSharpCorner");  
        if(scan.hasNextBigInteger())  
        {  
            out.println(scan.nextBigInteger());  
        }  
        if(scan.hasNextBigInteger(6))  
        {  
            out.println(scan.nextBigInteger());  
        }  
        scan.close();  
    }      
}   
