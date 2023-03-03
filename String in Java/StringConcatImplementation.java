import java.util.Scanner;

public class StringConcatImplementation {

	public static void main(String[] args) {

		System.out.println("                   Strings in Java");
		String str=new String("String 	Concatenation");
		System.out.println("Class: "+str.getClass());
		
		String new_str=new String(" In Java");
		
		System.out.println();
		System.out.println("After Concatenation of the String: ");
		System.out.println();
		System.out.println(str.concat(new_str));
		
	}

}
