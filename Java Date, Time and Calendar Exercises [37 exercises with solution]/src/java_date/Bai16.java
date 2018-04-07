package java_date;

import java.sql.Date;
import java.util.Calendar;

public class Bai16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 //two weeks
	     int noOfDays = 14; 
	     Calendar cal = Calendar.getInstance();
	     Date cdate = (Date) cal.getTime();
	     cal.add(Calendar.DAY_OF_YEAR, noOfDays);
	     Date date = (Date) cal.getTime();
	     System.out.println("\nCurrent Date: " + cdate+"\n");  
	     System.out.println("Day after two weeks: " + date+"\n");  	
	   

	}

}
