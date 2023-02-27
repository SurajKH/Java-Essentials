import java.util.Scanner;
import java.util.ArrayList;

public class Generics {
	//A generic function to print the contents of the ArrayList.
    public static <T> void displayArrayListElements(ArrayList<T> generic_arrayList)
    {
    	for(int i=0;i<generic_arrayList.size();i++)
    	{
    		System.out.print(generic_arrayList.get(i)+" ");
    	}
    }
	public static void main(String[] args) {

		System.out.println("                      Generics in Java");
		//here we set the arrayList to be of the type Integer over here.
		//ArrayList of type Integer.
		ArrayList<Integer> arrayList=new ArrayList<Integer>();
		int startLimit=10;
		int endLimit=50;
		System.out.println("Enter the size of the ArrayList: ");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			arrayList.add((int)(Math.random()*(endLimit-startLimit+1))+startLimit);
		}
		System.out.println("Contents of ArrayList: ");
		displayArrayListElements(arrayList);
		System.out.println("\nThe Class of ArrayList is: "+arrayList.getClass().getName());
		
		//now let us consider the ArrayList to be of the type Float.
		System.out.println();
		ArrayList<Float> floatList=new ArrayList<Float>();
		System.out.println("Enter the size of the ArrayList: ");
		int n1=sc.nextInt();
		for(int i=0;i<n1;i++)
		{
			floatList.add((float)(Math.random()*(endLimit-startLimit+1))+startLimit);
		}
		System.out.println("Contents of ArrayList: ");
		displayArrayListElements(floatList);
		System.out.println("\nThe Class of ArrayList is: "+floatList.getClass().getName());
		
		
	}

}
