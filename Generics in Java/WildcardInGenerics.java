package AdvancedJava;

import java.util.Arrays;
import java.util.List;

public class WildcardInGenerics {

	//we can consider the wildcard in generics to make sure that we can easily handle the subtypes over here.
	private static void printDetails(List<? extends Number> listcontent)
	{
		System.out.println();
		System.out.println("Contents of the List: ");
		System.out.println("Class: "+listcontent.getClass().getSimpleName());
		System.out.println(listcontent);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        System.out.println("      Wildcard in Generics in Java");
        
        Integer []intarr= {1,2,3,4,5};
        
        List<Integer> listintarr=Arrays.asList(intarr);
        Float []floatarr= {(float) 1.0,(float)2.0,(float)3.0};
        //both Integer and Float have Number Class as a SuperClass.
        List<Float> listfloatarr=Arrays.asList(floatarr);
        printDetails(listintarr);
        printDetails(listfloatarr);
	}

}
