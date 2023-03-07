package FunctionalProgrammingInJava;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamsInJavaImplementation {

	public static void main(String[] args) {

		System.out.println("                     Streams in Java");
		System.out.println();
		
		List<String> str=Arrays.asList(new String[]{"Streams","In","Java"});
		
		System.out.println();
		Stream<String> stream=str.stream();
		System.out.println("Class: "+stream.getClass().getName());
		System.out.println();
		System.out.println("Count of Unique Strings in the Stream: ");
		System.out.println(stream.distinct().count());
		System.out.println();
		Stream<String> orig_stream=str.stream();

		System.out.println("Let's sort the Stream over here:");
		//Stream<String> orig_stream=stream;
		System.out.println(orig_stream.collect(Collectors.toList()));
		Stream<String> orig_sort_stream=str.stream();
		System.out.println();
		System.out.println("The Sorted Stream is as followed:");
        System.out.println(orig_sort_stream.sorted().collect(Collectors.toList()));
        
        System.out.println();
        System.out.println("Filtering the Contents Present in the Stream");
       Stream<String> new_stream=str.stream();
       System.out.println(new_stream
    		   .filter(element -> element.endsWith("va") ).collect(Collectors.toList())); 
       
	}

}
