import java.util.Arrays;         
import static java.lang.System.out;  
        
public class Csharpcorner16   
{         
    public static void main(String[] args)         
    {         
        int demo[] = { 10, 20, 15, 22, 35 };    
            
        Arrays.parallelSort(demo);    
        out.print(Arrays.toString(demo));    
    }         
}    

