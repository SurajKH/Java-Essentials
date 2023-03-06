package filehandlingImplementationInJava;
import java.io.File;
public class DeleteAFileImplementation {

	public static void main(String[] args) {

		try
		{
			File testFile=new File("TestingFile.txt");
			System.out.println("File Got Created Successfully....");
			System.out.println("Class: ");
			System.out.println(testFile.getClass());
			System.out.println();
			System.out.println("Absolute Path: ");
			System.out.println(testFile.getAbsolutePath());
			System.out.println("\n\nEvaluating the Existence of the File:");
			System.out.println(testFile.exists());
			
			
			
			//delete the existing file.
			if(testFile.exists())
			{
				System.out.println("File Deletion is Possible.");
				testFile.delete();
				System.out.println("File Deleted SuccessFully...");
			}
			
			System.out.println("\n\nEvaluating the Existence of the File:");
			System.out.println(testFile.exists());
		}
		catch(Exception e)
		{
			System.out.println("Message: "+e.getMessage());
			e.printStackTrace();
		}
	}

}
