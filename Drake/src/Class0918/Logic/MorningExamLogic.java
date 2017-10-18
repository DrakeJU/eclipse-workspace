package Class0918.Logic;

import Class0918.Data.MorningExamData;

public class MorningExamLogic {	
	
	public MorningExamData setDDData(String x) {
		int index = -1;
		int start = -1;
		
		MorningExamData data = new MorningExamData();
		
		for( int i = 0; i<x.length();i++) {
			index = x.indexOf("^",index+1);
			if(i==0) {
				data.setName(x.substring(start+1, index));
			}else if(i==1) {
				data.setKor(Integer.valueOf(x.substring(start+1,index)));
			}else if (i==2) {
				data.setEng(Integer.valueOf(x.substring(start+1,index)));
			}else if (i==3) {
				data.setMath(Integer.valueOf(x.substring(start+1)));
			}
			start = index;
		}
		return data;
	}

}
