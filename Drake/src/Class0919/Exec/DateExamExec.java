package Class0919.Exec;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateExamExec {
	//현재 시간을 14:30:ss 으로 나타나게하시오
	public static void main(String[] args) {
		Date date = new Date();
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd H:mm:ss");
		System.out.println( "오늘 날짜 : "+ dateFormat.format(date));
		
	}

}
