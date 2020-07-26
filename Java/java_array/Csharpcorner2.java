import java.util.Arrays;    
import static java.lang.System.out;   
          
public class Csharpcorner2   
{       
        public static void main(String[] args)       
        {       
            // Get the Array       
            int demo[][][] = {{{1, -2, 3}, {2, 3, 4}}, { {-4, -5, 6, 9}, {1}, {2, 3}} };      
          
            // To convert the elements as List       
            for (int[][] array2D: demo) {    
                for (int[] array1D: array2D) {    
                    for(int item: array1D) {    
                            out.println(item);    
                    }    
                }    
            }      
        }       
}  
