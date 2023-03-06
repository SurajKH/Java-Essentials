package filehandlingImplementationInJava;

import java.io.IOException;
import java.io.File;

public class FileHandlingClass {

	public static void main(String[] args) {

		//If file is not present then it throws IOException.
		try
		{
			//new file creation.
			File f=new File("NewFile.txt");
			if(f.createNewFile())
			{
				System.out.println("New File got created...");
			}
			else
			{
				System.out.println("File Already Exists!!!");
					
				
			}
		}
		catch(IOException e)
		{
			System.out.println("Exception Occured...");
			System.out.println(e.getMessage());
		}
		
	}

}
