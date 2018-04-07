package java_date;

import java.sql.Date;
import java.util.Calendar;

public class Bai17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Calendar cal = Calendar.getInstance();
	      Date cdate = (Date) cal.getTime();
	      // get next year
	      cal.add(Calendar.YEAR, 1); 
	      Date nyear = (Date) cal.getTime();
	      //get previous year
	      cal.add(Calendar.YEAR, -2); 
	      Date pyear = (Date) cal.getTime();
	      System.out.println("\nCurrent Date : " + cdate);
	      System.out.println("\nDate before 1 year : " + pyear);
	      System.out.println("\nDate after 1 year  : " + nyear+"\n");  	
	   

	}

}
