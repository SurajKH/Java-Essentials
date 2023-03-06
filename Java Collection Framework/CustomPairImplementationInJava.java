import java.util.Scanner;

class CustomPairClass<I,S>
{
	//private datamembers of the CustomPairClass.
	private I key;
	private S value;
	
	public CustomPairClass(I key,S value)
	{
		this.key=key;
		this.value=value;
	}
	
	public I getKey() {
		return key;
	}
	public void setKey(I key) {
		this.key = key;
	}
	public S getValue() {
		return this.value;
	}
	public void setValue(S value) {
	 this.value=value;
	}
	
}


public class CustomPairImplementationInJava {

	public static void main(String[] args) {

		System.out.println("                                Custom Pair Class Implementation in Java ");
		System.out.println("\nEnter the Pair Details:");
		System.out.println("\nEnter the Key:\n");
		Scanner sc=new Scanner(System.in);
		int key=sc.nextInt();
		System.out.println("Enter the Value:\n");
		String value=sc.next();
		CustomPairClass<Integer,String> p=new CustomPairClass<>(key,value);
		
		System.out.println("\n\nDetails of Pair:");
		System.out.println("Format:{Key,Value}");
		System.out.println();
		
		
		System.out.println("{ "+p.getKey()+" : "+p.getValue()+" } ");
		
	}

}
