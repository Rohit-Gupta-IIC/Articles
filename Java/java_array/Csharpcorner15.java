import java.util.Arrays;         
import static java.lang.System.out;   
        
public class Csharpcorner15   
{         
    public static void main(String[] args)         
    {         
        int demo[] = { 10, 20, 15, 22, 35 };    
            
        int demo1[] = { 10, 15, 22};    
        
        int ans;      
        ans = Arrays.mismatch(demo,demo1);    
        out.print(ans);    
    }         
}  
