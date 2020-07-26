import java.io.IOException;  
import java.nio.file.FileSystems;  
import java.util.Scanner;  
import static java.lang.System.out;    
      
class Csharpcorner9      
{      
    public static void main(String[] args) throws IOException  
    {      
        try (Scanner scanner = new Scanner(FileSystems.getDefault().getPath("lib","jdk.lib")))   
        {  
            out.println(scanner.nextLine());  
        }  
    }      
}  
