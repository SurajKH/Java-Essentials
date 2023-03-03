import java.util.Scanner;

public class StringComparetoImplementation {

	public static void main(String[] args) {

		  System.out.println("                  String CompareTo in Java");
		  Scanner sc=new Scanner(System.in);
		  System.out.println("Enter the String: ");
		  String str=sc.next();
		  System.out.println();
		  System.out.println("Enter the New String to be compared with Original String: ");
		  String new_str=sc.next();
		  //int res=str.compareTo(new_str);
		  //System.out.println(res);
		  if(str.compareTo(new_str)>0)
		  {
			  System.out.println();
			  System.out.println("Summary:");
			  System.out.println("The Two Strings are Equal...");
		  }
		  else
		  {
			  System.out.println();
			  System.out.println("Summary:");
			  System.out.println("The Two Strings are not Equal..");
		  }
		  
		  System.out.println();
		  System.out.println("Now Let Us consider Comparision of two strings by Ignoring The Cases:");
		  System.out.println();
//		  int res=str.compareToIgnoreCase(new_str);
//		  System.out.println(res);
		  if(str.compareToIgnoreCase(new_str)==0)
		  {
			  System.out.println();
			  System.out.println("Summary:");
			  System.out.println("The Two Strings are Equal...");
		  }
		  else
		  {
			  System.out.println();
			  System.out.println("Summary:");
			  System.out.println("The Two Strings are not Equal...");

		  }
		  
		  
	}

}
