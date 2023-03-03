package DateandTime;

import java.time.LocalTime;

public class LocalTimeImplementationInJava {

	public static void main(String[] args) {

		System.out.println("                  LocalTime in Java");
		LocalTime obj=LocalTime.now();
		System.out.println("Current Time: ");
		System.out.println(obj);
		
		System.out.println();
		System.out.println("Current Time in Terms of Hours,Mins ans Seconds");
		System.out.println("Hour: "+obj.getHour());
		System.out.println("Min:"+obj.getMinute());
		System.out.println("Seconds:"+obj.getSecond());
		System.out.println("NanoSeconds:"+obj.getNano());
		
	}

}
