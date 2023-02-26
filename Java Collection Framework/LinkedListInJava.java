import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

class CustomDescendingSort<T> implements Comparator<Integer>
{
	@Override
	public int compare(Integer o1,Integer o2)
	{
		return o2.intValue()-o1.intValue();
	}
}

class CustomSort<T> implements Comparator<Integer> {
	 

	@Override
	public int compare(Integer o1, Integer o2) {
		return o1.intValue()-o2.intValue();
	}
}
public class LinkedListInJava {
	
	
	static void utility_display_list(LinkedList<Integer> list,LinkedList<Integer> clonedList)
	{
		System.out.println("\nOriginal List: "+list);
		System.out.println("\nCloned List: "+clonedList);
	}

	public static void main(String[] args) {

		System.out.println("                         LinkedList in Java    ");
		LinkedList<Integer> list=new LinkedList<>();
		Scanner sc=new Scanner(System.in);
		System.out.println("\nEnter the initial size of the Linked List: ");
		int n=sc.nextInt();
		int startLimit=10;
		int endLimit=20;
		for(int i=0;i<n;i++)
		{
			list.add((int)(Math.random()*(endLimit-startLimit+1))+startLimit);
		}
		System.out.println("The Contents of the LinkedList are: ");
		System.out.println(list);
		System.out.println();
		System.out.println("The Contents of the Linked List are as followed(Usage of Iterators): ");
		Iterator<Integer> it=list.iterator();
		while(it.hasNext())
		{
			System.out.print(it.next()+" ");
		}
		
		System.out.println("\n\nCloned Version of LinkedList: ");
		LinkedList<Integer> clonedList=(LinkedList<Integer>) list.clone();
		System.out.println(clonedList);
		
		System.out.println("\n\nEquality check for Original and cloned LinkedList: ");
		System.out.println("\nOriginal List: "+list);
		System.out.println("\nCloned List: "+clonedList);
		boolean equal=(list.equals(clonedList));
		System.out.println("\nEquality Check Status:  "+equal);
		
		System.out.println("\n\nAdd Elements into the LinkedList: ");
		
		System.out.println("\n\nAdd Element at the first of the List: ");
		clonedList.addFirst(99);
		utility_display_list(list,clonedList);
		
		System.out.println("\n\nAdd Element at the end of the List: ");
		clonedList.addLast(100);
		utility_display_list(list,clonedList);
		

		
		System.out.println("\n\nElement at the front of the Linked List: ");
		System.out.println(clonedList.getFirst());
		
		System.out.println("\n\nElement at the end of the Linked List: ");
		System.out.println(clonedList.getLast());
		
		LinkedList<Integer> newclonedList=(LinkedList<Integer>) clonedList.clone();

		System.out.println("\n\nRemoval in LinkedList: ");
		System.out.println("\n\nRemove Element from front of the Linked List: ");
		newclonedList.pollFirst();
		utility_display_list(clonedList,newclonedList);
		
		System.out.println("\n\nElement from rear of the Linked List: ");
		newclonedList.pollLast();
		utility_display_list(clonedList,newclonedList);
		
       clonedList.sort(new CustomSort<Object>());
       System.out.println();
	   System.out.println("\n\nSorted Version of the List(clonedList) is: ");
	   System.out.println(clonedList);
	   
	   clonedList.sort(new CustomDescendingSort<Object>());
       System.out.println();
	   System.out.println("Descending Sorted Version of the List(clonedList) is: ");
	   System.out.println(clonedList);
	   		
	}

}
