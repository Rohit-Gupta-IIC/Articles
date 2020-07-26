import java.util.Arrays;         
import static java.lang.System.out;   
        
public class Csharpcorner12   
{         
    public static void main(String[] args)         
    {         
        int demo[] = { 10, 20, 15, 22, 35 };       
        
        int demo1[] = { 10, 15, 22};    
        boolean ans;      
        ans = Arrays.equals(demo, demo1);    
        out.print(ans);    
    }         
}
