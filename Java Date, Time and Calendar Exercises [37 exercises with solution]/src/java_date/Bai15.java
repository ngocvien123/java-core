package java_date;

import java.time.LocalTime;

public class Bai15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 LocalTime time = LocalTime.now(); 
	      // adding four hours
	      LocalTime newTime = time.plusHours(4);
	      System.out.println();
	      System.out.println("Time after 2 hours : " + newTime);
	      System.out.println();
	  

	}

}
