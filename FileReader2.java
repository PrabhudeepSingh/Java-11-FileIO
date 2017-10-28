
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReader2 
{
  public static void main(String[] args) throws FileNotFoundException, IOException 
  {
     File f=new File("prabhu.txt");
     FileReader fr=new FileReader(f);
     char ch[]=new char[(int)f.length()];
     fr.read(ch);
     for(char ch1:ch)
     {
        System.out.println("output"+ch);
     }
       
  }
}
