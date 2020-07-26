import java.io.File;    
import java.io.FileNotFoundException;    
import java.util.Scanner; 
import static java.lang.System.out;    
      
class Csharpcorner1      
{      
    public static void main(String[] args) throws FileNotFoundException      
    {      
        Scanner sc = new Scanner(new File("example.txt"));    
            
        while(sc.hasNext())    
        {    
            out.print(sc.next());    
        }    
    }      
}   
