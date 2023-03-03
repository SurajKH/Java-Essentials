interface AnonymousInterface
{
	//abstract method
	void display();
}

//we have considered an NormalClass implementing the AnonymousInterface over here.
class AnonymousClass implements AnonymousInterface
{

	@Override
	public void display() {
		System.out.println("Inside the Anonymous Class....");
		
	}
	
}
public class AnonymousClassesInJavaImplementation {

	public static void main(String[] args) {
		
		AnonymousInterface anonymousObject=new AnonymousClass()
		{
			
			
			@Override
			public void display() {
				
				System.out.println("\nClass: "+this.getClass());
				System.out.println("\nInside the Anonymous Class....");
				System.out.println("\nWe are considering an AnonymousClass creation using new Operator.");
				
			}
		};
		
		System.out.println("                         Anonymous Class in Java");
		anonymousObject.display();
	}

}
