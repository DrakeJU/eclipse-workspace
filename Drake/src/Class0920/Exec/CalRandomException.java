package Class0920.Exec;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;

public class CalRandomException {



	public static void main(String[] args) throws ParseException {
		//2010~2030년 중에 랜덤 추출
		//1~12월 랜덤추출
		//추출된 년도가 홀수이면 "해당월을 출력 할 수 없습니다."
		//	짝수이면 해당 월 추출

		Random rando = new Random();        

		int year =rando.nextInt(21)+2010;
		System.out.println("2010년에서 2030년사이의 해 : "+year);
		int month = rando.nextInt(12)+1;
		System.out.println("1월부터 12월 사이의 달 : "+month);

		if(year%2==1) {
			System.out.println("해당월은 출력 할 수 없습니다.");

			return;
		}

		SimpleDateFormat a = new SimpleDateFormat("yyyyMM");
		Calendar cal = Calendar.getInstance();
		String y = String.valueOf(year);
		String m = String.valueOf(month);
		String both =y+m;
		Date d1 = a.parse(both);
		cal.setTime(d1);
		System.out.println(d1);
		cal.set(year, month-1, 1);

		int startDay =cal.get(Calendar.DAY_OF_WEEK);
		int lastDate =cal.getActualMaximum(Calendar.DATE);

		int startDate = 1;
		System.out.print("시작 요일 : "+startDay+"\t"+"그달의 마지막 날자 : "+lastDate);

		System.out.print("\n");
		System.out.print("=====================================================");
		System.out.print("\n");

		System.out.println(" 일\t 월\t 화\t 수\t 목\t 금\t 토");
		for(int i = 1; startDate<=lastDate ; i++) {
			if(i>=startDay) {
				//System.out.print(startDate+"\t");
				System.out.print((startDate < 10) ? " " + startDate+"\t" : startDate+"\t");
				startDate++;
			}else {
				System.out.print(" *"+"\t");
			}
			if(i%7==0) {
				System.out.println("");
			}
		}

	}
}
