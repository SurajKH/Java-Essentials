import java.util.Scanner;

public class StringtoCharArrayImplementation {

	public static void main(String[] args) {

		System.out.println("                     String to Character Array in Java");
		System.out.println();
		System.out.println("Enter the String: ");
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		System.out.println("\nClass of "+str+" is: "+str.getClass().getName());
		
		
		char char_arr[]=str.toCharArray();
		System.out.println("\nWe have converted the String to char using toCharArray()");
		System.out.println("\nThe Contents of Character Array is as followed: ");
		System.out.println();
		System.out.print(" [ ");
		for(int i=0;i<char_arr.length-1;i++)
		{
			System.out.print(char_arr[i]+" , ");
		}
		System.out.print(char_arr[char_arr.length-1]);
		System.out.print("]");
	}

}
