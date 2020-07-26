import java.util.Scanner;  
import static java.lang.System.out;  
  
/** 
* An example program to read a String from console input in Java 
*/  
public class CSharpCorner  
{  
   public static void main(String[] args)  
  {  
       out.print("Enter a string : ");  
       Scanner scanner = new Scanner(System. in);  
       String inputString = scanner. nextLine();  
       out.println("String read from console is : \n"+inputString);  
   }  
} 
