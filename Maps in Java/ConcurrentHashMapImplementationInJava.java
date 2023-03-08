import java.util.concurrent.ConcurrentHashMap;
import java.util.Map.Entry;
import java.util.Scanner;

public class ConcurrentHashMapImplementationInJava {

	public static void main(String[] args) {

		     System.out.println("                                   ConcurrentHashMap in Java");
		     System.out.println();
		
		     ConcurrentHashMap<Integer,Integer> map=new ConcurrentHashMap<>();
             int startLimit=10;
			 int endLimit=15;
			 System.out.println("Enter the Number Entries in the ConcurrentHashMap: ");
			 Scanner sc=new Scanner(System.in);
			 int n=sc.nextInt();
			 for(int i=0;i<n;i++)
			 {
				int random_number=(int)(Math.random()*(endLimit-startLimit)+startLimit);
				map.put(random_number,map.getOrDefault(random_number,0)+1);
			 }
			 System.out.println("\nThe Contents of the HashMap are as followed:\n");
			 for(Entry<Integer, Integer> entry:map.entrySet())
			 {
				 System.out.println(entry.getKey()+":"+entry.getValue());
			 }
			 System.out.println();
			 System.out.println("The Keys Present in the ConcurrentHashMap is as followed:");
			 for(Integer key:map.keySet())
			 {
				 System.out.print(key.intValue()+" ");
			 }
			 System.out.println();
			 System.out.println();
			 System.out.println("The Values Present in the ConcurrentHashMap is as followed: ");
			 for(Integer value:map.values())
			 {
				 System.out.print(value+" ");
			 }
			 System.out.println();
			 System.out.println();
			 System.out.println("Check for the Presence of Key in the ConcurrentHashMap: ");
			 System.out.println("Enter th Key: ");
			 int key=sc.nextInt();
			 boolean res=map.containsKey(key);
			 System.out.println("Key Presence Status: "+res);
			 
			 System.out.println();
			 System.out.println("Mapping Count: "+map.mappingCount());
			 
			System.out.println();
			System.out.println("Replacing a value in the ConcurrentHashMap: ");
			System.out.println();
			map.put(12,2);
			System.out.println("Initial Contents of the  ConcurrentHashMap is: ");
			 for(Entry<Integer, Integer> entry:map.entrySet())
			 {
				 System.out.println(entry.getKey()+":"+entry.getValue());
			 }
			 System.out.println();
			System.out.println("Enter the Key to be replaced in the ConcurrentHashMap:\n");
			int newkey=sc.nextInt();
			map.replace(12,2,20);
			System.out.println("\nThe Updated Contents of the ConcurrentHashMap are as followed:\n");
			for(Entry<Integer, Integer> entry:map.entrySet())
			{
				 System.out.println(entry.getKey()+":"+entry.getValue());
			}
			
	}

}
