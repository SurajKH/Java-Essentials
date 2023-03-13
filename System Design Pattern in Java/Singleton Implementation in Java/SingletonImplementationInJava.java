package DesignPatterns;

class SingletonClass
{
	//singleton classes in Java
	static SingletonClass single_instance=new SingletonClass();
	
	private SingletonClass()
	{
		//by making the constructor as private.
		//we are restricting the creation of multiple instances for a Class.
		System.out.println();
		System.out.println("NOTE:");
		System.out.println("By making the Constructor as Private.");
		System.out.println("We are Restricting the Creation of Multiple Instances for a Class.");
	}
	
	static SingletonClass getInstance()
	{
		//we are returning the single instance over here..
		return single_instance;
	}
}
public class SingletonImplementationInJava {

	public static void main(String[] args) {

		System.out.println("                            Singleton Class in Java");
		//let's consider the instance of type SingletonClass.
		
		SingletonClass single_instance=SingletonClass.getInstance();
		System.out.println();
		System.out.println();
		System.out.println("Package Name:"+single_instance.getClass().getPackageName());
		System.out.println("Class: "+single_instance.getClass());        
		
	}

}
