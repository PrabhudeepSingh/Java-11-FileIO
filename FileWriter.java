import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
public class FileWriter
{
  public static void main(String[] args) throws IOException
  {
    FileWriter fw=new FileWriter("prabhudeep.txt");
    fw.write(100);
    fw.write("Software");
    fw.write('\n');
    char[] ch1={'a','b'};
    fw.write(ch1);
	
    fw.flush();
    fw.close();
  }
}
