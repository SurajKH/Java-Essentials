package DateandTime;

import java.util.Calendar;

public class CalendarClassImplementation {

	public static void main(String[] args) {

		System.out.println("                Calendar Class in Java");
		Calendar cobj=Calendar.getInstance();
		System.out.println("Time Zone: ");
		System.out.println(cobj.getTimeZone().getID());
		
		System.out.println();
		System.out.println("First Day of the Week:");
		System.out.println(cobj.getFirstDayOfWeek());
		
		System.out.println();
		System.out.println("Current Year:"+cobj.getWeekYear());
		
		System.out.println();
		System.out.println("Current Time: ");
		System.out.println(cobj.getTime());
		
		System.out.println();
		System.out.println("Calendar Type:");
		System.out.println(cobj.getCalendarType());
		
		System.out.println("Zone Offset Value:");
		System.out.println(cobj.ZONE_OFFSET);
		
		System.out.println();
		System.out.println("Get Available Calendar Types:");
		System.out.println(cobj.getAvailableCalendarTypes());
		
		System.out.println();
		Calendar cloned_cobj=(Calendar) cobj.clone();
		System.out.println("Exisiting Calendar:");
		System.out.println(cobj.getTimeZone().getDisplayName());
		System.out.println(cobj.getTimeZone().getID());
		System.out.println(cobj.getTime());

		System.out.println("\nCloned Calander:");
		System.out.println(cloned_cobj.getTimeZone().getDisplayName());
		System.out.println(cobj.getTimeZone().getID());
		System.out.println(cobj.getTime());
		
//		System.out.println("Equality Check for Existing and Closed Calendar: ");
//		System.out.println(cobj.compareTo(cloned_cobj));


	}

}
