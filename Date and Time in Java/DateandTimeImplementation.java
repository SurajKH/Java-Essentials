package DateandTime;

import java.time.LocalDate;

public class DateandTimeImplementation {

	public static void main(String[] args) {
		
		LocalDate obj=LocalDate.now();
		System.out.println("               Date and Time in Java");
		System.out.println("Today's Date: ");
		System.out.println(obj);
	    
		System.out.println();
		System.out.println("Leap Year Status: ");
		System.out.println(obj.isLeapYear());
		
		System.out.println();
		
		System.out.println("Day of Week:"+obj.getDayOfWeek());
		System.out.println("Day of Month: "+obj.getDayOfMonth());
		System.out.println("Day of Year: "+obj.getDayOfYear());
		
		System.out.println();
		System.out.println();
		System.out.println("Current Year:"+obj.getYear());
		System.out.println("Epoch Year: "+obj.ofEpochDay(0).getYear());
		System.out.println();
		System.out.println("No of Years Completed since the Start of Epoch Date: ");
		System.out.println(obj.getYear()-obj.ofEpochDay(0).getYear());
	}

}
