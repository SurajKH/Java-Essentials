import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Set;
import java.util.Scanner;

class ComparatorClass<K,V> implements Comparator<PairClass>
{

	@Override
	public int compare(PairClass o1, PairClass o2) {
		if(o1.valuecontent==o2.valuecontent)
		{
		   return 0;
		}
		else if(o1.valuecontent<=o2.valuecontent)
		{
			return 1;
		}
		return -1;
	}
	
}
class PairClass
{
	int keycontent;
	int valuecontent;
	
	PairClass(int key,int value)
	{
		this.keycontent=key;
		this.valuecontent=value;
	}
}

public class ComparatorInterfaceImplementationInJava {

	public static void main(String[] args) {

		System.out.println("                          Comparator Interface in Java");
		ArrayList<PairClass> studentList=new ArrayList<>();
        System.out.println("Enter the Number of Elements in the ArrayList: ");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
		System.out.println("Adding Contents into the ArrayList: ");
		System.out.println();
		for(int i=0;i<n;i++)
		{
			int id,age;
			System.out.println("Enter the Unique student Id: ");
			id=sc.nextInt();
			System.out.println("Enter the corresponding Age: ");
			age=sc.nextInt();
			studentList.add(new PairClass(id,age));
		}
		System.out.println();
		System.out.println("{Key:Value} Pairs are as followed: ");
		System.out.println();
		for(PairClass p:studentList)
		{
			System.out.println("{ "+p.keycontent+" : "+p.valuecontent+" }");
		}
		
		Collections.sort(studentList,new ComparatorClass());
		System.out.println();
		System.out.println("Sorting the Pair Using the Comparator Based on Age Category: ");
		System.out.println("{Key:Value} Pairs are as followed: ");
		System.out.println();
		for(PairClass p:studentList)
		{
			System.out.println("{ "+p.keycontent+" : "+p.valuecontent+" }");
		}
		//System.out.println(studentList.get(0).key);
	}

}
