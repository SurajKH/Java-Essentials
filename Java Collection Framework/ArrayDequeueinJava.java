import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;
import java.util.stream.Stream;

public class ArrayDequeueinJava {

	public static void main(String[] args) {

		Queue<Integer> q=new ArrayDeque<>();
		System.out.println("             ArrayDeque in Java               ");
		System.out.println();
		int startLimit=100;
		int endLimit=500;
		System.out.println("Enter the Elements into the Queue: ");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			q.add((int)(Math.random()*(endLimit-startLimit+1)+startLimit));
		}
		System.out.println();
		System.out.println();
		System.out.println("The Elements in the Queue are: ");
		System.out.println();
		System.out.println(q);
		System.out.println("\nQueue Size: "+q.size());
		
	    System.out.println("\nThe Accessing of Elements in the Queue Using Iterators: ");
	    System.out.println();
	    Iterator<Integer> it=q.iterator();
	    while(it.hasNext())
	    {
	    	System.out.println("Element: "+it.next());
	    }
	    System.out.println();
	    System.out.println("Element at the Peek Position in the Queue: "+q.peek());
	    Queue<Integer> orig_q=q;
	    System.out.println();
	    System.out.println("Removal of Peek Element from the Queue:");
	    System.out.println();
	    System.out.println("Original Queue: "+orig_q);
	    q.poll();	    
	    System.out.println("Updated Queue: "+q);
	    System.out.println();
	    System.out.println("Conversion from Queue to ArrayList: ");
	    Object[] arr=q.toArray();
	    List<Object> list=Arrays.asList(arr);
	    System.out.println();
	    System.out.println("Class Name: "+list.getClass().getName());
	    System.out.println();
	    System.out.println(list);
	    System.out.println();
	    
	    System.out.println("Conversion of Queue to Streams: ");
	    Stream<Integer> stream=q.stream();
	    System.out.println("Distinct Elements in the Stream: "+stream.distinct().count());
	    System.out.println("Class: "+stream.getClass().getName());
	}

}
