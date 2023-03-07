import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class LinkedHashMapImplementationInJava {

	public static void main(String[] args) {
		System.out.println("               LinkedHashMap in Java Collection Framework");
		
		LinkedHashMap<Integer,Integer> map=new LinkedHashMap<>();
		Scanner sc=new Scanner(System.in);
		System.out.println("\nLinkedHashMap maintains the ordering of the elements stored in the Map.");
		System.out.println();
		System.out.println("Enter the Number of Entries in the Map:\n");
		int n=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			int key,value;
		    System.out.println("Enter Key:\n");
		    key=sc.nextInt();
		    System.out.println("Enter Value:\n");
		    value=sc.nextInt();
		    map.put(key,value);
		}
		System.out.println("\nContents Added into the Map Successfully.");
		System.out.println("\nThe Contents of the Map:");
		for(Map.Entry<Integer,Integer> entry:map.entrySet())
		{
	       System.out.println("Key: "+entry.getKey());
	       System.out.println("Value: "+entry.getValue());
           System.out.println();
		}
		
		
	}

}
