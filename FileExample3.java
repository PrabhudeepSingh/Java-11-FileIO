import java.io.File;
import java.io.IOException;


public class FileExample3
{
  public static void main(String[] args) throws IOException
  {
    File f=new File("D:\\","deep.txt");
    
    f.createNewFile();
  }
}
 
