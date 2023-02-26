package ExceptionHandlinginJava;
import java.util.Scanner;

public class Throw {
	
	public static void indexTrack(int n,int ind,int arr[])
	{
		if(ind>n)
		{
			System.out.println("Exception Found.");
			throw new ArrayIndexOutOfBoundsException("Index out of Bounds....");
		}
		else
		{
			System.out.println("The Element present in the Particular Index in the Array is: "+arr[ind]);
		}
	}

	public static void main(String[] args) {
		
		System.out.println("Throw in Exception Handling");
		System.out.println();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Size of the Array:\n");
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=i;
		}
		System.out.println("Enter the Index to Access the elements present in the Array:\n");
		int ind=sc.nextInt();
		indexTrack(n,ind,arr);
       
	}

}
