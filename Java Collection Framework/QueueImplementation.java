import java.util.Queue;
import java.util.Scanner;
import java.util.Iterator;
import java.util.LinkedList;
public class QueueImplementation {

	public static void main(String[] args) {
		
		System.out.println("       Queue Interface in Java Collection Framework");
		Queue<Integer> q=new LinkedList<Integer>();
		Scanner sc=new Scanner(System.in);
		System.out.println("\nWe will be Considering LinkedList Class for Object Creation Purposes.");
		System.out.println("\nEnter the initial size of the Queue: ");
		int n=sc.nextInt();
		int startLimit=10;
		int endLimit=20;
		for(int i=0;i<n;i++)
		{
			q.offer((int)(Math.random()*(endLimit-startLimit+1))+startLimit);
		}
		System.out.println("Queue Size is: "+q.size());
		System.out.println("\nElements Present in the Queue are as followed: ");
		Iterator<Integer> it=q.iterator();
		
		while(it.hasNext())
		{
			System.out.print(it.next()+" ");
		}
		
	    System.out.println("\n\nStatus of Queue(Empty Status): "+q.isEmpty());
	    System.out.println();
		Queue<Integer> new_subqueue=new LinkedList<Integer>();
		for(int i=0;i<n/2;i++)
		{
			new_subqueue.offer((int)(Math.random()*(endLimit-startLimit+1))+startLimit);
		}
		Iterator<Integer> new_it=new_subqueue.iterator();
		System.out.println("Elements Present in the SubQueue are: ");
		while(new_it.hasNext())
		{
			System.out.print(new_it.next()+" ");
		}
		System.out.println();
		q.addAll(new_subqueue);
		
		System.out.println("Elements in the Queue after Appending the subqueue Elements:\n");
		Iterator<Integer> new_it_q=q.iterator();
		while(new_it_q.hasNext())
		{
			System.out.print(new_it_q.next()+" ");
		}
		System.out.println();
		
		System.out.println("\n\nElement present at Peek Position: "+q.peek());
		System.out.println("\nRemoval of head Element from the Queue: "+q.remove());
		System.out.println("\nElement present at Peek Position: "+q.peek());
		
	    System.out.println("Current Size of Queue: "+q.size());
		
		
	}

}
