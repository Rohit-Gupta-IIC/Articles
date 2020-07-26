import java.io.FileInputStream;    
import java.io.FileNotFoundException;    
import java.nio.charset.StandardCharsets;    
import java.util.Scanner;    
import static java.lang.System.out;    
      
class Csharpcorner8      
{      
    public static void main(String[] args) throws FileNotFoundException      
    {      
        Scanner scanner = new Scanner(new FileInputStream("example.txt").getChannel(),StandardCharsets.US_ASCII.name() );    
        out.println(scanner.nextLine());  
         
    }      
}       
