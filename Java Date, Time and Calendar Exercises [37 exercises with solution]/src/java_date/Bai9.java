package java_date;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Bai9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 // Get calendar set to current date and time
	      Calendar c = Calendar.getInstance();

	     // Set the calendar to monday of the current week
	     c.set(Calendar.DAY_OF_WEEK, Calendar.MONDAY);

	        System.out.println();
	     // Print dates of the current week starting on Monday
	       DateFormat df = new SimpleDateFormat("EEE dd/MM/yyyy");
	       System.out.println(df.format(c.getTime()));
	        for (int i = 0; i <6; i++) {
	         c.add(Calendar.DATE, 1);
	           }
	        System.out.println(df.format(c.getTime()));
			System.out.println();
	     

	}

}
