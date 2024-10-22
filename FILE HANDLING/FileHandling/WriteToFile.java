package FileHandling;
import java.io.FileWriter;
import java.io.FileNotFoundException;
import java.io.IOException;
public class WriteToFile {
    
    public static void main(String[] args)  {
        FileWriter f2;

               try{
                f2 =new FileWriter("FileHandling\\1.txt");
                f2.write("aasima mansuri \n CS-V ");

                f2.close();
                System.out.println("sucssessful");
               }
               catch(FileNotFoundException e)
        {
            System.out.println("error");
            e.printStackTrace();
        }
        catch(IOException e)
        {
            System.out.println("error");
            e.printStackTrace();
        }
        
    }

}
