import java.io.*;    
import java.lang.*;    
    
class Csharpcorner6    
{    
    public static void main(String[] args)    
    {    
        byte[] b_arr = {67, 83, 114, 97, 114, 112, 67, 111, 114, 110, 101, 114};    
        Charset cs = Charset.defaultCharset();    
        String s = new String(b_arr, 1, 4, cs);    
        //Shar          
    }    
}    
