import java.util.Scanner;

public class StringReplaceImplementation {

	public static void main(String[] args) {

		System.out.println("             String Replace in Java                    ");
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		
		System.out.println("The Entered String is: "+str);
		System.out.println();
		System.out.println("Enter the character to be replaced in the string: ");
		String original_string=str;
		char replacing_character=sc.next().charAt(0);
		
		System.out.println("\nOriginal String: ");
		System.out.println(original_string);
		System.out.println();
		System.out.println("New String: ");
		System.out.println(str.replace('a',replacing_character));
		
		
	}

}
