package java_date;

import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;

import jdk.jfr.Period;

public class Bai23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 LocalDate today = LocalDate.now(); 
	     LocalDate lastDayOfYear = today.with(TemporalAdjusters.lastDayOfYear());
	     java.time.Period period = today.until(lastDayOfYear);
	     System.out.println();
	     System.out.println("Months remaining in the year: "+period.getMonths());	
	     System.out.println();
	  

	}

}
