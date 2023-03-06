package filehandlingImplementationInJava;

import java.io.FileWriter;
import java.util.Scanner;

public class FileHandlingAppendInJava {

	public static void main(String[] args) {
		try
		{
			//let's consider Writing the Contents into the File.
			FileWriter WriteIntoFile=new FileWriter("NewFile.txt");
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the Contents into the File:");
			String content=sc.nextLine();
			char charr[]=content.toCharArray();
			WriteIntoFile.write(charr);
			
			CharSequence char_seq=content+"\n";
			WriteIntoFile.append(char_seq);
			System.out.println("The Data is updated in the File Successfully...");
			//close the file.
	       WriteIntoFile.close();
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}

}
