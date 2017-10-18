package Class0919.Exec;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class CalendaConstantExample {

	public static void main(String[] args) {

		SimpleDateFormat adf = new SimpleDateFormat("yyyy MM dd HH:mm:ss");
		Calendar calendar = Calendar.getInstance();
//		Calendar calendar = new GregorianCalendar(2013,1,28,13,24,5)
		
		//calendar.add(Calendar.YEAR, 1); 
		
		int year = calendar.get(Calendar.YEAR);
		int month = calendar.get(Calendar.MONTH);
		int dayOfMonth = calendar.get(Calendar.DAY_OF_MONTH);
		int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);
		int weekOfYear = calendar.get(Calendar.WEEK_OF_MONTH);
		int weekOfMonth = calendar.get(Calendar.WEEK_OF_MONTH);
		
		int hour = calendar.get(Calendar.HOUR);
		int hourOfDay = calendar.get(Calendar.HOUR_OF_DAY);
		int minute = calendar.get(Calendar.MINUTE);
		int second = calendar.get(Calendar.SECOND);
		int millisecond = calendar.get(Calendar.MILLISECOND);
		
		System.out.println(adf.format(calendar.getTime()));
		System.out.println("year \t\t: "+year);
		System.out.println("month \t\t: "+month);
		System.out.println("dayOfWeek \t: "+dayOfWeek);
		System.out.println("dayOfMonth \t: "+dayOfMonth);
		System.out.println("weekOfYear \t: "+weekOfYear);
		System.out.println("weekOfMonth \t: "+weekOfMonth);
		
		System.out.println("hour \t\t: "+hour);
		System.out.println("hourOfDay \t: "+hourOfDay);
		System.out.println("minute \t\t: "+minute);
		System.out.println("second \t\t: "+second);
		System.out.println("millisecond \t: "+millisecond);


	}

}
