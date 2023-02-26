package ExceptionHandlinginJava;

import java.util.Scanner;

public class FinallyBlock {

	public static void main(String[] args) {

		System.out.println("Finally Block in Exception Handling");
		System.out.println();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value for Number 1: ");
		int num1=sc.nextInt();
		
		System.out.println("Enter the value for Number 2: ");
		int num2=sc.nextInt();
		
		//what if num2 is 0 then it gives rise to DivideByZero Error.
	   //so how can we solve the problem using Exception Handling?
	   //Solution:By Using Try and Catch Block.
		
		try
		{
			System.out.println("The Result is: "+(num1/num2));
			
		}
		catch(Exception e)
		{
			//it is mandatory for a try block to have a corresponding catch block.
			System.out.println("\nInside Catch Block....");
			System.out.println("Stack Trace: "+e.getStackTrace());
			System.out.println("Message: "+e.getMessage());
		}
		finally
		{
			//finally block gets executed irrespective of occurence of exceptions.
			System.out.println("\nFinally Block....");
			System.out.println("Gets Executed Irrespective of Occurence of Exceptions.");
		}
	}

}
