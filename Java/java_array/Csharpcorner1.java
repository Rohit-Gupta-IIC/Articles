import static java.lang.System.out;  
import java.util.Arrays;         
        
public class Csharpcorner1
{         
    public static void main(String[] args)         
    {         
        // Get the Array         
        int demo[][] = { {2,7,9},{3,6,1},{7,4,2} };        
        
        // To convert the elements as List         
        for (int i=0; i< 3 ; i++)       
        {       
            for (int j=0; j < 3 ; j++)       
                out.print(demo[i][j] + " ");       
       
            out.println();       
        }          
    }         
}   
