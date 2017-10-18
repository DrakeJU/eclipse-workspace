package Class0922.Exec;

import java.util.Calendar;

public class TimeinMillisExample {

	public static void main(String[] args) throws InterruptedException {


		Calendar cal = Calendar.getInstance();
		long calMili = cal.getTimeInMillis();
		
		Thread.sleep(3000); //3000밀리세컨 이 3초 이다.
		
		Calendar cal2 = Calendar.getInstance();
		long cal2Mili = cal2.getTimeInMillis();
		System.out.println(""+ (cal2Mili - calMili)/1000 + "초");
	}

}
