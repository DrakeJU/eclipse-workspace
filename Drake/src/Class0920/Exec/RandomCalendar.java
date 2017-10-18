package Class0920.Exec;

import java.util.Calendar;
import java.util.Random;

public class RandomCalendar {
	//2000~2020년 사이에 랜덤으로 구해서
	//그중 1~12월까지 랜덤으로 구해서 그달의 달력 출력
	public static void main(String[] args) {

        Random rando = new Random();        
        
        int year =rando.nextInt(21)+2000;
        System.out.println("2000년에서 2020년사이의 해 : "+year);
        int month = rando.nextInt(12)+1;
        System.out.println("1월부터 12월 사이의 달 : "+month);

        
       Calendar cal = Calendar.getInstance();
       cal.set(year, month, 1);
       
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
