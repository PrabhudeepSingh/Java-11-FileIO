import java.io.File;
import java.io.IOException;

public class DisplayFiles
{
  public static void main(String[] args) throws IOException
  {
    int count=0;
	
    File f=new File("C:\\Program Files");
    String s[]=f.list();
	
    for(String s1:s)
    {
      count++;
      System.out.println(s1);
    }   
    System.out.println("total number: "+count);
  }
}
