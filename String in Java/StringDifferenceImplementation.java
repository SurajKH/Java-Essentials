import java.util.Scanner;

public class StringDifferenceImplementation {

	public static void main(String[] args) {

		System.out.println("                Difference Between nextLine() and next() in Strings in Java");
		Scanner sc=new Scanner(System.in);
		System.out.println();
		System.out.println();
		System.out.println("nextLine() in Strings in Java");
		System.out.println();
		System.out.println("Enter a Sentence with Spaces: ");
		String new_str=sc.nextLine();
		System.out.println("\nThe Sentence is: "+new_str);
		System.out.println();
		System.out.println();
		
		System.out.println("next() in Strings in Java");
		System.out.println();
		System.out.println("Enter a Sentence with Spaces: ");

		String next_str=sc.next();
		System.out.println("\nThe Sentence is: "+next_str);
		
		
		
	}

}
