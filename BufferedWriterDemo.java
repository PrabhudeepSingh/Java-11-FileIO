
import java.io.*;

public class BufferedWriterDemo 
{
   public static void main(String[] args) throws IOException 
   {
       FileWriter fw=new FileWriter("D:\\example.txt");
       BufferedWriter bw=new BufferedWriter(fw);
       bw.write(100);
       bw.write("Software");
       bw.newLine();
       bw.write("Software");
       char[] ch1={'a','b'};
       bw.write(ch1);
       bw.flush();
       bw.close();
    }
}
