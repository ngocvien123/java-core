package java_date;

import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Bai35 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {    
		      String originalString = "2016-07-14 09:00:02";
		      Date date = (Date) new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse(originalString);
		      String newstr = new SimpleDateFormat("MM/dd/yyyy, H:mm:ss").format(date);
		       System.out.println("\n"+newstr+"\n");
		      } 
		    catch (ParseException e) {
		    //Handle exception here
		     e.printStackTrace();
		   

	}

}
}
