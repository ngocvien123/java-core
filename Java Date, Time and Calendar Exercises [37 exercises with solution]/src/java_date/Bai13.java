package java_date;

import java.util.Calendar;

public class Bai13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  // Create a default calendar
        Calendar cal = Calendar.getInstance();
    //Set your date: cal.setTime(yourDate);
	System.out.println();
        int dayOfWeek = cal.get(Calendar.DAY_OF_WEEK);
        System.out.println("Day of the week : " + dayOfWeek); 
	System.out.println();


	}

}
