import static java.lang.System.out;   
import java.util.Arrays;         
            
public class Csharpcorner14   
 {         
        public static void main(String[] args)         
        {         
            int demo[][] = {{ 10, 20, 15, 22, 35 }};       
            
            int ans = Arrays.hashCode(demo);      
            out.print(ans);    
        }         
}     
