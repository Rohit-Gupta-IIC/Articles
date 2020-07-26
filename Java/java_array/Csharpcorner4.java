import java.util.Arrays;     
    
public class Csharpcorner4 
{     
    public static void main(String[] args)     
    {     
       int demo[] = { 10, 15, 20, 22, 35 };   
    
       int Key = 22;   
    
       int loc=Arrays.binarySearch(demo, Key)  
  
       int loc1=Arrays.binarySearch(demo, 1, 3, Key)  
    }     
}    

