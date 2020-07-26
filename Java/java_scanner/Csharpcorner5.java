import java.io.File;    
import java.io.FileNotFoundException;    
import java.io.FileReader;    
import java.util.Scanner;    
import static java.lang.System.out;    
      
class Csharpcorner5      
{      
    public static void main(String[] args) throws FileNotFoundException      
    {      
        FileReader reader = new FileReader(new File("example.txt"));    
        Scanner sc = new Scanner(reader);    
            
        while(sc.hasNext())    
        {    
            out.print(sc.next());    
        }    
    }      
}      
