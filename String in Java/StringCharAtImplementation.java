import java.util.Scanner;

public class StringCharAtImplementation {

	public static void main(String[] args) {

		System.out.println("                   Strings in Java");
		String str=new String("New String Object");
		System.out.println(str.getClass());
		
		System.out.println("Enter the Index Position to get the char element from the string: ");
		Scanner sc=new Scanner(System.in);
		int index=sc.nextInt();
		System.out.println("Characater at Index: "+str.charAt(index));
		
		
	     
	}

}
