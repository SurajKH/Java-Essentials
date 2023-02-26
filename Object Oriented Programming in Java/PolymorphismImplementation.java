package ObjectOrientedProgrammingConcepts;
import java.util.Scanner;

//Method Overloading.

class Shape
{
	int length,breadth,side,height;
	
	//Overloaded Method:area.
	public int area(int length,int breadth)
	{
		return length*breadth;
	}
	public int area(int side)
	{
		return (int)Math.pow(side,2);
	}
	public int area(int length,int breadth,int height)
	{
		return length*breadth*height;
	}
}

//method Overriding.
class Vehicle
{
	public Vehicle()
	{
		
	}
	void display()
	{
		System.out.println("Display Function inside Vehicle Class");
	}
}
class MotorCycle extends Vehicle
{
	public MotorCycle()
	{
		
	}
	@Override
	void display()
	{
		System.out.println("Method Overrided...");
		System.out.println("Display Function inside MotorCycle Class");
	}
}
public class PolymorphismImplementation {

	public static void main(String[] args) {
       System.out.println("----------Polymorphism in Object Oriented Programming-----------");
       System.out.println();
       System.out.println("Enter the Parameters for Square,Rectangle and Triangle: ");
       System.out.println("Enter side,length,breadth,height: ");
       Scanner sc=new Scanner(System.in);
       Shape sobj=new Shape();
       int side=sc.nextInt();
       int length=sc.nextInt();
       int breadth=sc.nextInt();
       int height=sc.nextInt();
       System.out.println("Area of Square: "+sobj.area(side));
       System.out.println("Area of Triangle: "+sobj.area(length,breadth,height));
       System.out.println("Area of Rectangle: "+sobj.area(length,breadth));
       
       System.out.println();
       System.out.println("Method Overriding");
       Vehicle vobj=new Vehicle();
       vobj.display();
       System.out.println();
       Vehicle motorobj=new MotorCycle();
       motorobj.display();
       
	}

}
