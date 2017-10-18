package Class0920.Exec;

import java.util.Calendar;
import java.util.Random;

public class ExceptionPreview {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Random Randy = new Random();
        Calendar calendar = Calendar.getInstance();
        
        System.out.println("오늘 날자 :"+calendar.get(Calendar.DATE));
        System.out.println("Randy Num :"+Randy.nextInt(2));
        
        try {
        		int abc = calendar.get(Calendar.DATE)/Randy.nextInt(2);
        		System.out.println(abc);
        }catch(Exception a){
			System.out.println("예외가 발생되어 Exception 객체가 잡음-->"+a);
        }
	}

}
