class EmployeeGenericClass <T>
{
	//now we need to define the datamembers of type T.
	private T empid;

	//we have considered the Constructor over here.
//	EmployeeGenericClass(T id)
//	{
//		this.empid=id;
//	}
	
	public void setempID(T id)
	{
		this.empid=id;
		
	}
	public T getEmpID()
	{
		return empid;
	}
}
public class GenericClassDefinition {

	public static void main(String[] args) {

		//let's create a generic class over here.
		System.out.println("                     Generics in Java");
		System.out.println();
		System.out.println("EmployeeGenericClass of Type Integer: ");
		EmployeeGenericClass<Integer> emp_generic_1=new EmployeeGenericClass<Integer>();
		System.out.println(emp_generic_1);
		System.out.println();
		System.out.println("Employee ID Integer Format: ");
		emp_generic_1.setempID(10);
		System.out.println("Employee ID: "+emp_generic_1.getEmpID());
		
		System.out.println();
		System.out.println("EmployeeGenericClass of Type Float: ");
		EmployeeGenericClass<Float> emp_generic_2=new EmployeeGenericClass<Float>();
		System.out.println(emp_generic_2);
		System.out.println();
		System.out.println("Employee ID Integer Format: ");
		emp_generic_2.setempID((float)10);
		System.out.println("Employee ID: "+emp_generic_2.getEmpID());
		//System.out.println("Class is: "+emp_generic_1.getClass());
		
		
		
		
	}

}
