package java_date;

import java.time.LocalDateTime;
import java.time.ZoneId;

public class Bai21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  ZoneId.SHORT_IDS.keySet().
		    stream().forEach( 
		    zoneKey ->System.out.println(" "+ ZoneId.of( ZoneId.SHORT_IDS.get( zoneKey ) ) +": "+ LocalDateTime.now(ZoneId.of(ZoneId.SHORT_IDS.get( zoneKey ) ) ) ) );
		   

	}

}
