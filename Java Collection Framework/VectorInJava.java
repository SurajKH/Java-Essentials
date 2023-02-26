import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Vector;
public class VectorInJava {

	public static void main(String[] args) {
		Vector<Integer> vec=new Vector<Integer>();
		System.out.println("         Vector in Java        ");
		int startLimit=100;
		int endLimit=500;
		System.out.println("\nEnter the Size: ");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			vec.add((int)(Math.random()*(endLimit-startLimit+1)+startLimit));
		}
		System.out.println();
		System.out.println();
		System.out.println("The Elements in the Vector are: ");
		System.out.println("\nSize: "+vec.size());
		for(int item:vec)
		{
			System.out.print(item+" ");
		}
		System.out.println();
		System.out.println("\n\nDifference between the Size and Capacity of a Vector:");
		System.out.println("Size of Vector: "+vec.size());
		System.out.println("Capacity of the Vector: "+vec.capacity());
		
		System.out.println();
		System.out.println();
		
		System.out.println("Original Version of Vector: ");
		System.out.println(vec);
		
		System.out.println("Cloned Version of Vector: ");
		Vector<Integer> clonedVector=(Vector<Integer>) vec.clone();
		System.out.println(clonedVector);
		
		System.out.println("\n\nElements present in the Vector are(Using Iterators): ");
	    Iterator<Integer> it=vec.iterator();
	    while(it.hasNext())
	    {
	    	System.out.print(it.next()+" ");
	    }
	    System.out.println("\n\nSorted Version of Vector:");
	    Collections.sort(vec);
	    it=vec.iterator();
	    while(it.hasNext())
	    {
	    	System.out.print(it.next()+" ");
	    }
	}

}
