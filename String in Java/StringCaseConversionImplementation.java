import java.util.Scanner;

public class StringCaseConversionImplementation {

	public static void main(String[] args) {

		System.out.println("                             StringCase Conversions in Java");
		System.out.println("\nEnter the String(With Lower and UpperCase Characters): ");
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		System.out.println("Original String: ");
		System.out.println(str);
		
		
		System.out.println();
		System.out.println();
		System.out.println("toUpperCase() in Strings: ");
		System.out.println();
		
		String newString=str.toUpperCase();
		System.out.println("Original String: "+str);
		System.out.println("UpperCase String: "+newString);
		
		
		System.out.println();
		System.out.println();
		System.out.println("toLowerCase() in Strings: ");
		System.out.println();
		
		String newlowerString=str.toLowerCase();
		System.out.println("Original String: "+str);
		System.out.println("UpperCase String: "+newlowerString);
		
		
		
	}

}
