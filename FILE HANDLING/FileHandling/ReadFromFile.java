package FileHandling;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.util.Scanner;

class ReadFromFile {
    public static void main(String[] args)  {
        try {
            File f1 =new File("FileHandling\\aasima.txt");
            Scanner sc = new Scanner(f1);

                if(f1.exists())
                {

                    while(sc.hasNextLine())
                    {
                        String temp = sc.nextLine();
                        System.out.println(temp);
                    }
        
                    System.out.println("reading done from file");
                }
                else
                {
                    System.out.println("file not FOund");
                }
                sc.close();

        } catch (FileNotFoundException e) {
            System.out.println(" not FOund");
            e.printStackTrace();
        } 
   
        
    }


}