package filehandlingImplementationInJava;

import java.io.File;
import java.io.IOException;

public class FileDetailsImplementationInJava {

	public static void main(String[] args) {
		//If file is not present then it throws IOException.
				try
				{
					//new file creation.
					File f=new File("FileDetails.txt");
					System.out.println("                 File Handling in Java");
					if(f.createNewFile())
					{
						System.out.println("New File got created...");
						System.out.println("Details About File");
						System.out.println();
						System.out.println("File Name: "+f.getName());
						System.out.println("File Size in Bytes: "+f.length());
						System.out.println("File Absolute Path: "+f.getAbsolutePath());
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
