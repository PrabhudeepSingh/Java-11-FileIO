import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReader3 
{
    public static void main(String[] args) throws FileNotFoundException, IOException
 {
    File f=new File("D:\\prabhu.txt");
    FileReader fr=new FileReader(f);
    char ch[]=new char[(int)f.length()];
    fr.read(ch);
	
    for(char ch1:ch)
    {
       System.out.println("output   "+ch1);
    }
	
    System.out.println("***********"); 
    FileReader fr1=new FileReader("D:\\prabhu.txt");
	
    int i=fr1.read();
    while(i!=-1)
    {
       System.out.println((char)i);
       i=fr1.read();
    }
  }
}

