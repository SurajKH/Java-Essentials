import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.Spliterator;
import java.util.TreeSet;

public class TreeSetInJava {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("          TreeSet in Java         ");
		Set<Integer> st=new TreeSet<>();
		
		System.out.println("\nEnter the Size: ");
		int n=sc.nextInt();
		int startLimit=10;
		int endLimit=50;
		for(int i=1;i<=n;i++)
		{
			st.add((int)(Math.random()*(endLimit-startLimit))+startLimit);
		}
		Iterator<Integer> it=st.iterator();
		System.out.println("\nThe Elements present in the TreeSet(Using Iterator): ");
	    while(it.hasNext())
	    {
	    	System.out.print(it.next()+" ");
	    }
	    
		System.out.println("\nThe TreeSet Size is: "+st.size());
		System.out.println("The Class: "+st.getClass());
		Set<Integer> st_store=st;
		System.out.println("\nRemove an Element from the TreeSet:");
		System.out.println("Before Removal: ");
		System.out.println(st_store);
		st.remove(10);
		System.out.println("After Removal: ");
		System.out.println(st);
		
		Spliterator<Integer> splitList=st.spliterator();
		System.out.println("The Elements present in the TreeSet(Using Splititerator): ");
		splitList.forEachRemaining(System.out::println);
		ArrayList<Integer> arr_set=new ArrayList<Integer>();
		Iterator<Integer> new_it=st.iterator();
		while(new_it.hasNext())
		{
			arr_set.add(new_it.next());
		}
		
		Collections.sort(arr_set);
		System.out.println("\n\nThe Sorted Version of the TreeSet: ");
		System.out.println(arr_set);
	}

}
