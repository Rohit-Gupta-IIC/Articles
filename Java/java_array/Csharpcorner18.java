import java.util.Arrays;         
import java.util.Spliterator;    
import static java.lang.System.out;   
       
public class Csharpcorner18     
{         
        public static void main(String[] args)         
        {         
            int demo[] = { 10, 20, 15, 22, 35 };    
                
            Spliterator.OfInt demo1= Arrays.spliterator(demo);    
            out.print(demo1);    
            Spliterator.OfInt demo2= Arrays.spliterator(demo,1,3);    
            out.print(demo2);    
        }         
} 
