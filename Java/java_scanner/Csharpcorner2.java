import java.io.File;    
import java.io.FileNotFoundException;    
import java.nio.charset.StandardCharsets;    
import java.util.Scanner;  
import static java.lang.System.out;    
      
class Csharpcorner2      
{      
    public static void main(String[] args) throws FileNotFoundException      
    {      
        Scanner sc = new Scanner(new File("example.txt", StandardCharsets.US_ASCII.name()));    
            
        while(sc.hasNext())    
        {    
            out.print(sc.next());    
        }    
    }      
}     
