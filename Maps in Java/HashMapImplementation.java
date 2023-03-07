import java.util.Map;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class HashMapImplementation {

	public static void main(String[] args) {

		 System.out.println("                   HashMap in Java Collection Framework");
		 Scanner sc=new Scanner(System.in);
		 System.out.println("\nEnter The Initial Number of Entries Size of the HashMap: ");
		 int n=sc.nextInt();
		 Map<Integer,Integer> map=new HashMap<>();
		 int startLimit=10;
		 int endLimit=15;
		 for(int i=0;i<n;i++)
		 {
			int random_number=(int)(Math.random()*(endLimit-startLimit)+startLimit);
			map.put(random_number,map.getOrDefault(random_number,0)+1);
		 }
		 System.out.println("\nThe Contents of the HashMap are as followed: ");
		 for(Map.Entry<Integer,Integer> entry:map.entrySet())
		 {
			 System.out.println(entry.getKey()+":"+entry.getValue());
		 }
		 System.out.println();
		 System.out.println("The Keys Present in the HashMap is as followed:");
		 for(Integer key:map.keySet())
		 {
			 System.out.print(key.intValue()+" ");
		 }
		 System.out.println();
		 System.out.println();
		 System.out.println("The Values Present in the HashMap is as followed: ");
		 for(Integer value:map.values())
		 {
			 System.out.print(value+" ");
		 }
		 System.out.println();
		 System.out.println("Checking for the Existence of Key in the HashMap");
		 System.out.println("\nEnter the Key: ");
		 int key=sc.nextInt();
		 System.out.println("\nStatus of Presence of Key in the HashMap: "+map.containsKey(key));
		 System.out.println();
		 
		 System.out.println("Size of HashMap: "+map.size());
	}

}
