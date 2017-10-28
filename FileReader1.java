import java.io.*;
import java.io.IOException;

public class FileReader1
{
   public static void main(String[] args) throws IOException
  {
    FileReader fr=new FileReader("D:\\prabhu.txt");
    int i=fr.read();
    while(i!=-1)
    {
      System.out.println((char)i);
      i=fr.read();
    }
  }
} 
    

