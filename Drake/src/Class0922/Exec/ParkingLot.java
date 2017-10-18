package Class0922.Exec;

import java.util.Calendar;
import java.util.Random;

public class ParkingLot {

	public static void main(String[] args) {

		Calendar inTime = Calendar.getInstance();
		Calendar outTime = Calendar.getInstance();
		Random r = new Random();

		inTime.set(2017, 1, 1, r.nextInt(24)+1, r.nextInt(59)+0);
		outTime.set(2017, 1, 1, r.nextInt(24)+1, r.nextInt(59)+0);

		System.out.println("in Time : "+inTime.getTime());
		System.out.println("out Time : "+outTime.getTime());

		long a = inTime.getTimeInMillis()/60000;
		long b = outTime.getTimeInMillis()/60000;
		long c = 0;//차이 분

		if ( a >= b ) {
			System.out.println("오류 :  나간시간보다 들어온시간이 늦습니다.");
			return ;//try catch 사용할것
		}else {
			c=b-a;
		}
		System.out.println("a-b 사용시간의 분 : "+c);
		long hourly = c/60;
		System.out.print("시간: "+hourly+"	");
		long minute = c%60;
		System.out.println("	분: "+minute);
		long day = c/60/24;
		System.out.println("파킹한 날 :"+day+ " 일");

		long fee = 0;

		if(hourly>14) {
			if(hourly/24>1) {
				fee += hourly*10000;
			}else {
				fee += (hourly/14)*10000;
			}
		}
		fee = fee + (minute/10)*500;
		long lastMin = minute%10;
		if(lastMin>0&&lastMin<10) {
			fee+=500;
		}
		System.out.println("금액 : "+fee+"원");
	}

}


