package java_date;

import java.text.DateFormatSymbols;
import java.util.Locale;

public class Bai12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 // Localize in German
		  
		  DateFormatSymbols symbols = new DateFormatSymbols(new Locale("de"));
		   // for the current Locale :
		   //   DateFormatSymbols symbols = new DateFormatSymbols(); 
		    String[] dayNames = symbols.getWeekdays();
		    for (String s : dayNames) { 
		    System.out.print(s + "\n");
			System.out.println();
		    

	}
	}
}
