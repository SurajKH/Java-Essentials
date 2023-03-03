import java.util.Scanner;

public class StringSplitImplementation {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("                   String Split in Java");
		System.out.println("\nEnter the String: ");
		String str=sc.nextLine();
		String[] splitStr=str.split(",");
		System.out.println();
		System.out.println("The String After Spliting based on Regex is: ");
		for(int i=0;i<splitStr.length;i++)
		{
			System.out.println("Entry: "+splitStr[i]);
		}
		
		System.out.println();
		System.out.println("Split the String based on Empty Spaces in Java");
		System.out.println();
		System.out.println("Enter the String: ");
		String new_str=sc.nextLine();
		String [] splitString=new_str.split(" ");
		System.out.println("The String after Spliting based on Regex is: ");
		for(int i=0;i<splitString.length;i++)
		{
			System.out.println("Entry: "+splitString[i]);
		}
	}

}
