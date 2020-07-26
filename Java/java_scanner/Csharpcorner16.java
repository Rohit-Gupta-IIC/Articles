import java.util.Scanner;  
import static java.lang.System.out;    
      
class Csharpcorner16      
{      
    public static void main(String[] args)  
    {      
        Scanner scan =  new Scanner("CSharpCorner");  
        if(scan.hasNextBigDecimal())  
        {  
            out.println("true");  
        }  
        else  
        {  
            out.println("false");  
        }  
        scan.close();  
    }      
}   

