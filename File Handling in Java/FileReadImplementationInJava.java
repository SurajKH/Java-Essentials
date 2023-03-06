package filehandlingImplementationInJava;
import java.io.FileReader;
import java.util.Scanner;

public class FileReadImplementationInJava 
{
	public static void main(String []args)
	{

		try
		{
			System.out.println("              File Handling in Java");
			FileReader readFile=new FileReader("NewFile.txt");
			System.out.println("Class: ");
			System.out.println(readFile.getClass());
			System.out.println("Reading the Contents from the File:");
			Scanner read_scanner=new Scanner(readFile);
			
			while(read_scanner.hasNext())
			{
				System.out.println("Contents: ");
				String fileData=read_scanner.next();
				System.out.println(fileData);
			}
			readFile.close();	
		}
		catch(Exception e)
		{
			System.out.println("Exception Occured....");
			System.out.println("Message: "+e.getMessage());
			e.printStackTrace();
		}

	}
}
