import java.util.Scanner;   
import static java.lang.System.out;    
          
class Csharpcorner22          
{          
    public static void main(String[] args)      
    {          
        Scanner scan =  new Scanner("CSharpCorner");      
        if(scan.hasNextInt())      
        {      
            out.println(scan.nextInt());      
        }      
        if(scan.hasNextInt(6))      
        {      
            out.println(scan.nextInt());      
        }      
        scan.close();      
    }          
}     
