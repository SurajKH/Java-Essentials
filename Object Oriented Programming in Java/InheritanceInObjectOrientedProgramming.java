package ObjectOrientedProgrammingConcepts;

class ParentClass
{
	public ParentClass()
	{
		//Zero Paramterized Constructor.
	}
	void display()
	{
        System.out.println(this.getClass().getName());
		System.out.println("Display Method of Parent Class.");
	}
}

class SubClass extends ParentClass
{
	public SubClass()
	{
		//Zero Parameterized Constructor.
	}
	void display()
	{
		System.out.println("Display Method of Child Class.");
	}
}

public class InheritanceInObjectOrientedProgramming {

	public static void main(String[] args) {
      
		System.out.println("------Inheritance in Object Oriented Programming----------------");
		ParentClass pobj=new ParentClass();
		System.out.println("\n-------Parent Class------");
		pobj.display();
		System.out.println();
		System.out.println("\n-------Child Class-------");
		SubClass cobj=new SubClass();
		cobj.display();
		
	}

}
