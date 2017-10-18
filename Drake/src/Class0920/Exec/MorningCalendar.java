package Class0920.Exec;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;


public class MorningCalendar {
	//9월 달력 출력해보세요.

	public static void main(String[] args) throws ParseException {

		SimpleDateFormat a = new SimpleDateFormat("yyyyMMdd");
		Calendar cal = Calendar.getInstance();
		Date aa = a.parse("20170901");

		cal.setTime(aa);
		
		int firstDay = cal.get(Calendar.DAY_OF_WEEK); //5, day는 일월화수목금토일
		int lastDate = cal.getActualMaximum(Calendar.DATE);//30
		
		int Date = 1;
		System.out.println("첫번째날의 요일 : "+firstDay);
		System.out.println("일 \t\t월 \t\t화 \t\t수 \t\t목 \t\t금 \t\t토"+"\n\n");
		for(int i = 1; Date<=lastDate;i++) {
			if(i>=firstDay) {
				System.out.print(Date+"\t\t");
				Date++;
			}else {
				System.out.print("*"+"\t\t");
				}

				if(i%7==0) {
					System.out.println("\n\n");
				}

			}


		}
	}

