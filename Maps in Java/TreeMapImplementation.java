import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class TreeMapImplementation {

	public static void main(String[] args) {

		 System.out.println("                   TreeMap in Java Collection Framework");
		 Scanner sc=new Scanner(System.in);
		 System.out.println("\nEnter The Initial Number of Entries Size of the TreeMap: ");
		 int n=sc.nextInt();
		 Map<Integer,Integer> map=new TreeMap<>();
		 int startLimit=23;
		 int endLimit=45;
		 for(int i=0;i<n;i++)
		 {
			int random_number=(int)(Math.random()*(endLimit-startLimit)+startLimit);
			map.put(random_number,map.getOrDefault(random_number,0)+1);
		 }
		 System.out.println("\nThe Contents of the TreeMap are as followed: ");
		 for(Map.Entry<Integer,Integer> entry:map.entrySet())
		 {
			 System.out.println(entry.getKey()+":"+entry.getValue());
		 }
		 System.out.println();
		 System.out.println("The Keys Present in the TreeMap is as followed:");
		 for(Integer key:map.keySet())
		 {
			 System.out.print(key.intValue()+" ");
		 }
		 System.out.println();
		 System.out.println();
		 System.out.println("The Values Present in the TreeMap is as followed: ");
		 for(Integer value:map.values())
		 {
			 System.out.print(value+" ");
		 }
		 System.out.println();
		 System.out.println("Checking for the Existence of Key in the TreeMap");
		 System.out.println("\nEnter the Key: ");
		 int key=sc.nextInt();
		 System.out.println("\nStatus of Presence of Key in the TreeMap: "+map.containsKey(key));
		 System.out.println();
		 
		 int prev_size=map.size();
		 System.out.println("\nEnter the Key to be deleted from the TreeMap:");
		 int delKey=sc.nextInt();
         map.remove(delKey);
         System.out.println();
         System.out.println("Size of TreeMap Before Deletion: "+prev_size);
		 System.out.println("Size of TreeMap After Deletion: "+map.size());

	}

}
