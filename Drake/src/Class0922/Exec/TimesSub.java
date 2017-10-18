package Class0922.Exec;

import java.util.Calendar;

public class TimesSub {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calendar calendar = Calendar.getInstance();
		Calendar setCal = Calendar.getInstance();
		Calendar tmp = Calendar.getInstance();
		
		setCal.set(2015, 1, 2, 10, 10, 00); //날자 세팅하기
		
		System.out.println("현재시간 출력:"+calendar.getTime());
		System.out.println("set 한 시간 출력 : "+setCal.getTime());
		
		long a = calendar.getTimeInMillis();
		long b = setCal.getTimeInMillis();
		long differentSec = (calendar.getTimeInMillis() - setCal.getTimeInMillis())/1000; //1000으로 나눠야 초가 됨
		System.out.println("두 날짜는 "+differentSec+"초 만큼 다름");
		
		long DifferetMinute = (differentSec/(60));
		long DifferetHour = (DifferetMinute/(60));
		long DifferetDay = (DifferetHour/(24));
		long Differetyear = (DifferetDay/(365));
		
		System.out.println("오늘과 설정된 날자의 차이 Year : "+Differetyear);
		System.out.println("오늘과 설정된 날자의 차이 Day : "+DifferetDay);
		System.out.println("오늘과 설정된 날자의 차이 Hour : "+DifferetHour);
		System.out.println("오늘과 설정된 날자의 차이 Minute : "+DifferetMinute);
		System.out.println("오늘과 설정된 날자의 차이 Second : "+differentSec);
		long year = 0;
		long month = 0;
		long date = 0;
		long hourOfDay = 0;
		long minute = 0;
		long second = 0;
		while (a!=b) {
			long leftSec;
			long difSec = (a-b)/1000;
			
			if(difSec/(365*12*24*60*60)>4) {
				difSec+= 24*60*60;
			}else {
				year = difSec/(365*24*60*60);
				leftSec = difSec - difSec/(365*24*60*60);
				month=leftSec/(12*24*60*60);
				leftSec = leftSec - leftSec/(12*24*60*60);
				date = leftSec/(24*60*60);
				leftSec = leftSec - leftSec/(24*60*60);
				hourOfDay = leftSec/(60*60);
				leftSec = leftSec - leftSec/(60*60);
				minute = leftSec/60;
				leftSec = leftSec - leftSec/(60);
				second = leftSec/60;
				System.out.println("year " + (int)year);
				System.out.println("month "+ (int)month);
				System.out.println("date " + date);
				System.out.println("hour "+hourOfDay);
				System.out.println("minute "+minute);
				System.out.println("second "+second);

				tmp.set((int)year, (int)month, (int)date, (int)hourOfDay, (int)minute, (int)second);
			}
			
			System.out.println(tmp.getTimeInMillis());
			break;
		}

		
		
	}

}
