package ObjectOrientedProgrammingConcepts;

import java.util.Scanner;

/*
Abstraction:is considered as one of the Object Oriented Programming Principles which reffers to hiding the internal details of an application 
from the outer world. 
*/

abstract class Employee
{
//declaring abstract method
  abstract void display(int empid,String empName);       
}

//let's try to extend the class.
//NOTE:whenever the class extends an abstract class it is important to implement all the abstract methods.

class EmployeeDetails extends Employee
{
	/*EmployeeDetails()
	{
		System.out.println("Employee Constructor");
	}*/

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
public class AbstractionUsingAbstractClass {

	public static void main(String[] args) {
		
		EmployeeDetails empDetails=new EmployeeDetails();
		System.out.println("--------------Abstraction Using Abstract Classes in Object Oriented Programming.----------------");
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
