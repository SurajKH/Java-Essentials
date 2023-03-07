package FunctionalProgrammingInJava;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SieveResultClass {

	public static void main(String[] args) {

		System.out.println("                           To Determine the Prime Status of Numbers Present in the List");
		List<Integer> values =new ArrayList<Integer>();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number Entries into the List:");
		int n=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			int item=sc.nextInt();
			values.add(item);
		}
		System.out.println("Iterationg through th Elements present in the List:");
	    values.forEach((val)->SeiveGeneratorClass.seive_function(val));
	}

}
