import java.util.Scanner;  
import static java.lang.System.out;    
      
class Csharpcorner21      
{      
    public static void main(String[] args)  
    {      
        Scanner scan =  new Scanner("CSharpCorner");  
        if(scan.hasNextFloat())  
        {  
            out.println(scan.nextFloat());  
        }  
        scan.close();  
    }      
}   
