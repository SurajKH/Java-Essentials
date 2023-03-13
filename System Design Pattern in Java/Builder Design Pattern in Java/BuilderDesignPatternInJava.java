package DesignPatterns;
import java.util.Scanner;

class Employee
{
	private String emp_designation;
	private String emp_name;
	private String employee_address;
	
	//usage of getters to access the value of private members outside the class.
	
	String getDesignation()
	{
		return this.emp_designation;
	}
	
	String getName()
	{
		return this.emp_name;
	}
	
	String getAddress()
	{
		return this.employee_address;
	}
	
	private Employee(EmployeeBuilder empBuilder)
	{
		this.emp_name=empBuilder.emp_name;
		this.emp_designation=empBuilder.emp_designation;
		this.employee_address=empBuilder.employee_address;
	}
	
	public static class EmployeeBuilder
	{
		private String emp_designation;
		private String emp_name;
		private String employee_address;
		
		public EmployeeBuilder(String emp_name,String emp_designation)
		{
			this.emp_designation=emp_designation;
			this.emp_name=emp_name;
		}
		
		public EmployeeBuilder setEmployeeAddress(String emp_address)
		{
			this.employee_address=emp_address;
			return this;
		}
		
		public Employee buildEmployee()
		{
			return new Employee(this);
		}
		
	}
	
}


public class BuilderDesignPatternInJava {

	public static void main(String[] args) {

		System.out.println("             Builder Design Pattern in Java");
		System.out.println();
		
		String empName,empAddress,empDesignation;
		System.out.println("Enter All the Details of Employee: ");
		Scanner sc=new Scanner(System.in);
		System.out.println();
		System.out.println("Enter the Name of the Employee: ");
		empName=sc.nextLine();
		System.out.println("Enter the Designation of the Employee: ");
		empDesignation=sc.nextLine();
		System.out.println("Enter the Address of the Employee: ");
		empAddress=sc.nextLine();
		
		Employee NecessaryDetails=new Employee.EmployeeBuilder(empName, empDesignation).buildEmployee();
		Employee AllDetails=new Employee.EmployeeBuilder(empName, empDesignation).setEmployeeAddress(empAddress).buildEmployee();
		
		System.out.println();
		System.out.println("Necessary Details of an Employee: ");
		System.out.println("Employee Name: "+NecessaryDetails.getName());
		System.out.println("Employee Designation: "+NecessaryDetails.getDesignation());
		
		System.out.println();
		System.out.println();
		System.out.println("All the Details of an Employee:");
		System.out.println("Employee Name: "+AllDetails.getName());
		System.out.println("Employee Designation: "+AllDetails.getDesignation());
		System.out.println("Employee Address: "+AllDetails.getAddress());
	}

}
