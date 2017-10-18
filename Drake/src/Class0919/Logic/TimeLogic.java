package Class0919.Logic;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class TimeLogic {

	//1) time 값이 ""빈공간시 현재시간으로
	//2) 20170919112625
	
	String time;
	String strRet;
	
	Date date = new Date();
	SimpleDateFormat dateFormat = new SimpleDateFormat();

	public String getTimeFormat(String time, String format) throws Exception {

		if(time.equals("")) {
			
			Calendar cal = Calendar.getInstance();
			SimpleDateFormat formatsetup = new SimpleDateFormat(format);
			
			//System.out.println("현재시간 : "+formatsetup.format(cal.getTime()));
			
			return formatsetup.format(cal.getTime());
			
		}else if(time.length()==14){

			SimpleDateFormat formatsetup = new SimpleDateFormat(format);
			SimpleDateFormat formatoutput = new SimpleDateFormat("yyyyMMddhhmmss");
			
			strRet = formatoutput.format(formatsetup.parse(time));
		}
		
		return strRet;
	}
	
	
}

//String yyyy = time.substring(0, 5);
//String MM = time.substring(4,6);
//String dd = time.substring(6,8);
//String hh = time.substring(8,10);
//String mm = time.substring(10,12);
//String ss = time.substring(12,14);
//
//Date newyyyy = formatsetup.parse(yyyy);
//Date newMM = formatsetup.parse(MM);
//Date newdd = formatsetup.parse(dd);
//Date newhh = formatsetup.parse(hh);
//Date newmm = formatsetup.parse(mm);
//Date newss = formatsetup.parse(ss);
