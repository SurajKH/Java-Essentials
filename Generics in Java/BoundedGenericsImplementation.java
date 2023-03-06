package AdvancedJava;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class BoundedGenericsImplementation {

	//let's consider the Bounded Generics
	//here the Conversion is restricted to the String Class.
	private static <T extends String> List<T> ArraytoArrayList(T[] array)
	{
		//we need to convert the Array to ArrayList over here.
		return Arrays.asList(array);
	}
	public static void main(String[] args) {
		System.out.println("                 Bounded Generics in Java");
		String []arrStr={"Bounded","Genrics","In","Java"};
		System.out.println();
		System.out.println("Class: "+arrStr.getClass());
		System.out.println();
		System.out.println();
		List<String> list=ArraytoArrayList(arrStr);
		System.out.println("After Conversion from Array to List Using Bounded Generics");
		System.out.println("Class: "+list.getClass());
		System.out.println("Contents of List: ");
		System.out.println(list);
        
	}

}
