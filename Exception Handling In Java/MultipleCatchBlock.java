package ExceptionHandlinginJava;
import java.util.Scanner;

public class MultipleCatchBlock {

	public static void main(String[] args) {
     
		System.out.println("Multiple Catch Block in Exception Handling.");
		Scanner sc=new Scanner(System.in);
		int n=10;
		int[] arr=new int[n];
		String str="Exception Handling";
	    try
	    {
	    	//Gives rise to ArrayIndexOutofBoundsException. 
	    	//arr[n+1]=50;
	    	
	    	//Gives rise to NumberFormatException.
	    	Integer i=Integer.parseInt(str);
	    	//System.out.println(str);
	    	
	    }
	    catch(ArrayIndexOutOfBoundsException e)
	    {
	    	System.out.println("\nException Caught.....");
	    	System.out.println("Stack Trace: "+e.getStackTrace());
	    	System.out.println("Description: "+e.toString());
	    	System.out.println("Message: "+e.getMessage());
	    }
	    catch(NumberFormatException e)
	    {
		    //Integer i=Integer.parseInt(str);
	    	System.out.println("\nException Caught.....");
	    	System.out.println("Stack Trace: "+e.getStackTrace());
	    	System.out.println("Description: "+e.toString());
	    	System.out.println("Message: "+e.getMessage());
	    }
		
	}

}
