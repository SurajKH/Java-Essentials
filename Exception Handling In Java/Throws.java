package ExceptionHandlinginJava;
import java.util.Scanner;

public class Throws {

	public static void printDetails(int arr[]) throws ArithmeticException
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the index position to access the element from the array: ");
		int ind=sc.nextInt();
		if(ind>arr.length)
		{
			throw new ArrayIndexOutOfBoundsException("Array Index Out of Bound");
		}
		else
		{
			System.out.println("Element present in the Index: "+arr[ind]);
		}
		return;
	}
	public static void main(String[] args) {
		
		System.out.println("Throws in Exception Handling");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
	    for(int i=0;i<n;i++)
	    {
	    	arr[i]=i*10/2;
	    }	
       try
       {
   		 printDetails(arr);
 
       }
       catch(Exception e)
       {
    	   System.out.println("\nInside Catch Block....");
		   System.out.println("Stack Trace: "+e.getStackTrace());
		   System.out.println("Message: "+e.getMessage());
       }
	}

}
