package ObjectOrientedProgrammingConcepts;

import java.util.Scanner;

interface EmployeeInterface
{
	public void display(int empid,String empname);
}

class EmployeeDetailsInterface implements EmployeeInterface
{
	/*EmployeeDetails()
	{
		System.out.println("Employee Constructor");
	}*/
     @Override
	public void display(int empId,String empName)
	{
		//method body is defined over here.
		System.out.println("\nEmployee Details: ");
		System.out.println("-----------------------------------------");
		System.out.println("Employee ID: "+empId);
		System.out.println("Employee Name: "+empName);
		System.out.println("-----------------------------------------");
	}
	
}

public class AbstractionUsingInterfaces {

	public static void main(String[] args) {
		EmployeeDetailsInterface empDetails=new EmployeeDetailsInterface();
		System.out.println("-------------Abstraction Using Interfaces in Object Oriented Programming.--------------");
		System.out.println();
		System.out.println("Enter Employee Details:    ");
		System.out.println("Enter Employee ID: ");
		Scanner sc=new Scanner(System.in);
		int empid=sc.nextInt();
		System.out.println("Enter Employee Name: ");
		String empName=sc.next();
		empDetails.display(empid,empName);

	}

}
