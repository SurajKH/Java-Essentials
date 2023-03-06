package AdvancedJava;
import java.util.*;
/*
 OpenJDK:free and opensource.
 
 */
public class GenericsImplementation {

	/*
	  syntax for generic methods:
	    access specifier static <T> f_name(T obj)
	    {
	     //code.
	    }
	 */
	private static <T> List<T> convert(T[] array)
	{
		//now we need to return the array over here.
		return Arrays.asList(array);
		
	}
	
	public static void main(String args[])
	{
		List shapes=new ArrayList<>();
		shapes.add("Circle");
		System.out.println(shapes.get(0));
		
		//we can easily typecast it to String.
		//which is not safe.
		
		//typecasting is done over here.
		String str=(String)shapes.get(0);
		
		//solution:usage of generics
		//we tend to store the data of same time while working with generics.
		
		
		//usage of one method for conversion.
		//conversion of array to list.
		
		Integer[] numbers= {1,2,3,4,5};
		System.out.println(numbers.getClass());
		System.out.println();
		//here we are considering list of type Integer.
		List<Integer> numlist=convert(numbers);
		//now we get class as ArrayList.
		System.out.println(numlist.getClass());
		System.out.println();
	}
}
