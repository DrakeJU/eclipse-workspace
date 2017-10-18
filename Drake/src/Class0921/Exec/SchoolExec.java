package Class0921.Exec;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Random;

import Class0921.Data.SchoolData;




public class SchoolExec {

	public static void main(String[] args) {

		String[] name = {"단군","이성계","동명왕","박혁거세","관창","김유신","선덕여왕","장보고","대조영","의천"}; //10명
		String[] subject = {"국어","영어","수학","체육"};//4과목
		int []	subNum = {100,90,80,70,60,50,40,30,20,10,0};//10~100 점 //11개
		
		
		Random r = new Random();
		HashMap<String, SchoolData> hm = new HashMap<String, SchoolData>();

		while(true) {
			if(hm.size() == 10) {
				break;
			}
			SchoolData sd = new SchoolData();
			int count = 0;
			int rname = r.nextInt(10)+0;

			while(true) {

				String tmp = subject[r.nextInt(4)+0];	//과목 배열에서도 값을 하나 뽑는다.
				int Ntmp = subNum[r.nextInt(11)+0];		//점수 배열에서도 값을 하나 뽑는다.

				//System.out.println("dd");
				
				if(sd.getCount()==4) {				//ifSchoolData에 count가 4가 되면 종료 )
					double sum = (double)(sd.getKor() + sd.getMath() + sd.getEng() + sd.getGym())/4;
					sd.setAvg(sum);
					break;
				}
				
				if(tmp.equals("국어")) {
					if(sd.getKor()==-1) {
						sd.setKor(Ntmp);
						count++;
						sd.setCount(count);
					}
				}else if(tmp.equals("영어")) {
					if(sd.getEng()==-1) {
						sd.setEng(Ntmp);
						count++;
						sd.setCount(count);
					}	 
				}else if(tmp.equals("수학")) {
					if(sd.getMath()==-1) {
						sd.setMath(Ntmp);
						count++;
						sd.setCount(count);
					}
				}else if(tmp.equals("체육")) {
					if(sd.getGym()==-1) {
						sd.setGym(Ntmp);
						count++;
						sd.setCount(count);
					}
				}
				//System.out.println(count);
			}
			System.out.println(hm.size());
			hm.put(name[rname], sd);

		}
		
		Iterator it = hm.keySet().iterator();
		
		ArrayList<HashMap> successor = new ArrayList<HashMap>();
		ArrayList<HashMap> loser = new ArrayList<HashMap>();
		
		//[단군 의천 이성계....]
		while(it.hasNext()) {
			String key = (String)it.next();
			SchoolData tmp = hm.get(key);
			
			if (tmp.getAvg() >= 50) {
				successor.add()
			}
			
			System.out.println("이름 : " + key + "   평균 : " + tmp.getAvg() + " 영어 : " + tmp.getEng() + " 수학 : " + tmp.getMath() + " 국어 : " + tmp.getKor() + " 체육 : " + tmp.getGym());
		}
		
		System.out.println("ss");
	}

}

