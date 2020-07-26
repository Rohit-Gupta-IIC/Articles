import java.util.Arrays;         
import static java.lang.System.out;   
        
public class Csharpcorner17     
{         
    public static void main(String[] args)         
    {         
        int demo[] = { 10, 20, 15, 22, 35 };    
            
        Arrays.sort(demo);    
        out.print(Arrays.toString(demo));    
        Arrays.sort(demo, 1, 3);    
        out.print(Arrays.toString(demo));    
    }         
}   
