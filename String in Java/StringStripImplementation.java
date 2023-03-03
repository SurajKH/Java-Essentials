import java.util.Scanner;

public class StringStripImplementation {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
        System.out.println("                       Removal of Trailing White Spaces from the String in Java");
		System.out.println("\nEnter the String(With WhiteSpaces): ");
		String new_str=sc.nextLine();
		System.out.println("\nThe Original String is: ");
		System.out.println(new_str);
		
		System.out.println("\nThe Modified String after removal of WhiteSpaces is: ");
		String modified_str=new_str.strip();
		System.out.println(modified_str);
		
		//removal of leading white spaces from String in Java
		
		System.out.println("\n\n\n\nEnter the String(With Trailing WhiteSpaces): ");
		String new_string=sc.nextLine();
		
		System.out.println("\nThe Original String is: ");
		System.out.println(new_string);
		
		System.out.println("\nThe Modified String after trailing of WhiteSpaces is: ");
		String modified_new_str=new_string.stripLeading();
		System.out.println(modified_new_str);
	}

}
