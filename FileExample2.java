import java.io.File;
import java.io.IOException;


public class FileExample2
{
  public static void main(String[] args) throws IOException
  {
    File f=new File("prabhu");
    f.mkdir();
	
    File f1=new File("prabhu","a.txt");
    File f2=new File(f,"b.txt");
	
    f1.createNewFile();
    f2.createNewFile();
  }
}
 
