package filereadandwrite;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileDemo
{
    public static void main(String[] args)
    {

        try {
            File Obj = new File("myfile.txt");
            
          	// Creating File
          	if (Obj.createNewFile()) {
                System.out.println("File created: " + Obj.getName());
            }
            else {
                System.out.println("File already exists.");
            }

            FileWriter Writer = new FileWriter("myfile.txt");

            // Writing File
            Writer.write("Files in Java are seriously good!!");
            Writer.close();
            
            System.out.println("Successfully written.");

            Scanner Reader = new Scanner(Obj);
          
            // Traversing File Data
          	while (Reader.hasNextLine()) {
                String data = Reader.nextLine();
                System.out.println(data);
            }
          
            Reader.close();
        }
      
      	// Exception Thrown
        catch (IOException e) {
            System.out.println("An error has occurred.");
            e.printStackTrace();
        }
    }
}
