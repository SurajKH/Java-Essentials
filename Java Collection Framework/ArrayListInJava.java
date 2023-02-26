import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;


public class ArrayListInJava {

	public static void main(String[] args) {

		ArrayList<Integer> arrList=new ArrayList<Integer>();
		System.out.println("             ArrayList in Java               ");
		System.out.println();
		int startLimit=100;
		int endLimit=500;
		System.out.println("Enter the Elements into the ArrayList: ");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			arrList.add((int)(Math.random()*(endLimit-startLimit+1)+startLimit));
		}
		System.out.println();
		System.out.println();
		System.out.println("The Elements in the ArrayList are: ");
		System.out.println("\nSize: "+arrList.size());
		for(int item:arrList)
		{
			System.out.print(item+" ");
		}
		System.out.println();
		System.out.println("\n\nCloning of Elements in the ArrayList: ");
		ArrayList<Integer> cloneList=(ArrayList<Integer>) arrList.clone();
		System.out.println(cloneList);
		System.out.println("Size: "+cloneList.size());
		System.out.println();
		
		
	    System.out.println("\n\nElement present at 0th index is: "+cloneList.get(0));
	    
	    System.out.println();
	    System.out.println("\n\nElements present in the ArrayList are(Using Iterators): ");
	    Iterator<Integer> it=arrList.iterator();
	    while(it.hasNext())
	    {
	    	System.out.print(it.next()+" ");
	    }
	    System.out.println("\n\nSorted Version of ArrayList:");
	    Collections.sort(arrList);
	    it=arrList.iterator();
	    while(it.hasNext())
	    {
	    	System.out.print(it.next()+" ");
	    }
	    
	    System.out.println("\n\nConversion from ArrayList to Array: ");
	    Object[] arr=arrList.toArray();
	    System.out.println("Type of ArrayList is: "+arrList.getClass());
	    System.out.println("Type of Array is: "+arr.getClass().getName());
	}

}
