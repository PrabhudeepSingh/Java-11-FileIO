import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class PrintWriterDemo
{
   public static void main(String[] args) throws IOException
   {
     FileWriter fw=new FileWriter("D:\\example.txt");
     PrintWriter bw=new PrintWriter(fw);
     bw.write(100);
     bw.println("Software");
     bw.println("Software");
     bw.println("Software");
     bw.flush();
     bw.close();
        
   }
}
