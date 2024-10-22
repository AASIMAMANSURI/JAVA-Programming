package FileHandling;
import java.io.File;

class FileInformation{
    public static void main(String[] args)
    {
        File fobj;
      
            fobj =new File("FileHandling/aasima.txt");
            if(fobj.exists())
            {
                System.out.println("File Name : " + fobj.getName());
                System.out.println("File Path : " + fobj.getAbsolutePath());
                System.out.println("File length : " + fobj.length());
                System.out.println("File is readable : " + fobj.canRead());
                System.out.println("File is writable : " + fobj.canWrite());

            }
            else
            {
                System.out.println("File not found");
            }
      
      
    }
}


// output :
// File Name : aasima.txt
// File Path : C:\Users\dcs\Desktop\file\FileHandling\aasima.txt
// File length : 21
// File is readable : true
// File is writable : true