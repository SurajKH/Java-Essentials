package DateandTime;

import java.util.Date;

public class DateClassImplementationInJava {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {

		System.out.println("                  Date Class in Java");
		Date dateObj=new Date();
		
		System.out.println("Today's Date: ");
		System.out.println(dateObj);
		
		System.out.println();
		System.out.println("Number of Seconds Elapsed from the Start of Epoch: ");
		System.out.println("Epoch: 01-01-1970");
        System.out.println("Number of Seconds Elapsed: "+dateObj.getTime()/1000+"Seconds");
        System.out.println();
        
        System.out.println("Year:1900 is considered as the Base Reference Year");
        //here the Year is calculated by considering the 1900 as the Point of Reference.
        System.out.println("Current Year:"+dateObj.getYear());
        dateObj.setYear(dateObj.getYear()+100);
        System.out.println("100 Years from Now:"+dateObj.getYear());
        
	}

}
