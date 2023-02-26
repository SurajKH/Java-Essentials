import java.util.Scanner;
import java.util.Comparator;
import java.util.Iterator;
import java.util.PriorityQueue;

class CustomComparator implements Comparator<Integer>
{

	@Override
	public int compare(Integer o1, Integer o2) {
		return o1<o2?1:-1;
	}
	
}
public class PriorityQueueInJava {
	

	public static void main(String[] args) {

		System.out.println("             Priority Queue in Java            ");
		PriorityQueue<Integer> pq=new PriorityQueue<>();
		//by default pq is a min-heap.
		PriorityQueue<Integer> pq_max_heap=new PriorityQueue<>(new CustomComparator());
		Scanner sc=new Scanner(System.in);
		System.out.println("\nEnter the initial size of the Priority Queue: ");
		int n=sc.nextInt();
		int startLimit=10,endLimit=50;
		for(int i=0;i<n;i++)
		{
          pq.add((int)(Math.random()*(endLimit-startLimit))+startLimit);
          pq_max_heap.add((int)(Math.random()*(endLimit-startLimit))+startLimit);
		}
		System.out.println("\n\nMin Heap: ");
		System.out.println("Size of Priority Queue: "+pq.size());
		System.out.println("\nThe Contents of the Priority are as followed: ");
		while(!pq.isEmpty())
		{
			System.out.print(pq.poll()+" ");
		}
		

		
		System.out.println("\n\nMax Heap: ");
		System.out.println("Size of Priority Queue: "+pq_max_heap.size());
		System.out.println("\nThe Contents of the Priority are as followed: ");
		while(!pq_max_heap.isEmpty())
		{
			System.out.print(pq_max_heap.poll()+" ");
		}

	}
}
