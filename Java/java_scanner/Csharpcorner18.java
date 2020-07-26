import java.util.Scanner;  
import static java.lang.System.out;    
      
class Csharpcorner18      
{      
    public static void main(String[] args)  
    {      
        Scanner scan =  new Scanner("CSharpCorner");  
        if(scan.hasNextBoolean())  
        {  
            out.println(scan.nextBigInteger());  
        }  
        scan.close();  
    }      
} 
