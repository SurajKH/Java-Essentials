import java.util.EnumMap;
import java.util.Map;
import java.util.Scanner;

enum EmployeeTrackClass
{
	Technology,Finance,HumanResource,Marketting;
}

public class EnumMapImplementationInJava {

	
	public static void main(String[] args) {
		
		System.out.println("                        EnumMaps in Java");
		System.out.println();
		EnumMap<EmployeeTrackClass,String> enumap=new EnumMap<>(EmployeeTrackClass.class);
		Scanner sc=new Scanner(System.in);
		System.out.println("Adding Contents into the EnumMaps: ");
		System.out.println("\nEnter the Field of Study: ");
		String str=sc.next();
		enumap.put(EmployeeTrackClass.Technology,str);
		System.out.println("\nEnter the Field of Study: ");
		String str1=sc.next();
		enumap.put(EmployeeTrackClass.Finance,str1);
		
		System.out.println("\nEnter the Field of Study: ");
		String str2=sc.next();
		enumap.put(EmployeeTrackClass.Marketting,str2);
		
		System.out.println("\nEnter the Field of Study: ");
		String str3=sc.next();
		enumap.put(EmployeeTrackClass.HumanResource,str3);
		System.out.println();
		System.out.println("\nThe Contents of EnuMap is as followed:");
		System.out.println(enumap);
	}

}
