package Class0919.Exec;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateExample {

	public static void main(String[] args) throws Exception{
		// Instatniate a Date object , 현날짜와 시간 가저옴
		Date date = new Date();
		System.out.println("오늘 날짜 : "+date.toString());
		System.out.println(" 시간 : "+ date.getHours());
		
		//2nd way : 입력받을 Date를 특정 형식으로 나타낼 date 포맷객체 생성
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss");
		System.out.println("오늘 날짜 : "+dateFormat.format(date));
		
		//문자열을 날짜형으로 변환
		SimpleDateFormat dateformat2 = new SimpleDateFormat("dd-MM-yyyy hh:mm:ss");
		
		String strdate2 = "02-04-2013 11:35:42";
		Date newdate = dateformat2.parse(strdate2);
		System.out.println(newdate);
		
		//날짜비교
		//1st way : using before() , after(), equals()
		SimpleDateFormat dateformat3 = new SimpleDateFormat("dd/MM/yyyy");
		
		Date date1 = dateformat3.parse("17/01/1989");
		Date date2 = dateformat3.parse("15/10/2007");
		
		System.out.println("Date1 : "+dateformat3.format(date1));
		System.out.println("Date2 : "+dateformat3.format(date2));
		
		if(date1.after(date2)) {
			System.out.println("Date1이 Date2보다 늦다.");
		}else if (date1.before(date2)) {
			System.out.println("Date1이 Date2 보다 빠르다.");
		}else if (date1.equals(date2)) {
			System.out.println("Date1이 Date2 와 같다.");
		}
		//2nd way : using compareTo()
		date1 = dateformat3.parse("27/02/2012");
		date2 = dateformat3.parse("27/09/2009");
		
		System.out.println("Date1 : "+dateformat3.format(date1));
		System.out.println("Date2 : "+dateformat3.format(date2));
		
		if (date1.compareTo(date2)>0) {
			System.out.println("Date1 이 Date2보다 늦다.");
		}else if (date1.compareTo(date2)<0) {
			System.out.println("Date1 이 Date2 보다 빠르다.");
		}else if (date1.compareTo(date2) == 0) {
			System.out.println("Date1 과 Date2 는 같다.");
		}

	}

}
