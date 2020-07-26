import java.util.Scanner;  
import java.util.regex.Pattern;  
import static java.lang.System.out;    
      
class Csharpcorner15      
{      
    public static void main(String[] args)  
    {      
        Scanner scan =  new Scanner("CSharpCorner");  
        while(scan.hasNext())  
        {  
            out.print(scan);  
        }  
        String pattern = "Sharp";  
        if(scan.hasNext(pattern))  
        {  
            out.println("Pattern Found");  
        }  
        Pattern pattern1 =  Pattern.compile("[[A-Za-z]*");  
        while(scan.hasNext(pattern1))  
        {  
           out.println(scan.next());  
        }  
        scan.close();  
    }      
}  
