import static java.lang.System.out;   
import java.util.Arrays;         
        
public class Csharpcorner13   
{         
    public static void main(String[] args)         
    {         
        int demo[] = { 10, 20, 15, 22, 35 };       
        
        int intKey = 22;     
      
        Arrays.fill(demo, intKey);     
        out.print(Arrays.toString(demo));    
    }         
} 
