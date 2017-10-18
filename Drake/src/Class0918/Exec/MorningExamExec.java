package Class0918.Exec;
// Array / Hashmap 연습한것.
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

import Class0918.Data.MorningExamData;
import Class0918.Logic.MorningExamLogic;

public class MorningExamExec {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String hong= "홍길동^50^90^70";
		String lee = "이순신^60^70^50";
		String kim = "김구^100^40^30";
		
		MorningExamLogic logic = new MorningExamLogic();

		MorningExamData d4 = logic.setDDData(hong);
		MorningExamData d5 = logic.setDDData(lee);
		MorningExamData d6 = logic.setDDData(kim);
		
		//MorningExamData d = new MorningExamData();
		
//		d4 = d.setDDData(hong);
//		d5 = d.setDDData(lee);
//		d6 = d.setDDData(kim);
		
		HashMap <String, MorningExamData> map = new HashMap <String, MorningExamData> ();

		map.put(d4.getName(), d4);
		map.put(d5.getName(), d5);
		map.put(d6.getName(), d6);
		
		System.out.println("키의 수 : "+ map.size());
		System.out.println("d4의 이름 값은 ? "+d4.getName());
		
		MorningExamData tmp = map.get("홍길동");
		System.out.println(tmp.getName() + " ");
		
		Set<String> hongset = map.keySet();
		Iterator<String> hongiterator = hongset.iterator();
		while(hongiterator.hasNext()) {
			String a = (String)hongiterator.next();
			MorningExamData b = (MorningExamData)map.get(a);
			System.out.println("국어 : "+a+"---->값 : "+b.getKor());
			System.out.println("영어 : "+a+"---->값 : "+b.getEng());
			System.out.println("수학 : "+a+"---->값 : "+b.getMath());
			
		}
		
		/*
		List<MorningExamData> list = new ArrayList<MorningExamData>();
		
		list.add(MorningExamLogic.setDDData(hong));
		list.add(MorningExamLogic.setDDData(lee));
		list.add(MorningExamLogic.setDDData(kim));
		
		for(int i = 0; i < list.size();i++) {
			System.out.println("이름 : "+((MorningExamData)list.get(i)).getName());
			System.out.println("국어 : "+((MorningExamData)list.get(i)).getKor());
			System.out.println("영어 : "+((MorningExamData)list.get(i)).getEng());
			System.out.println("수학 : "+((MorningExamData)list.get(i)).getMath());
			System.out.println("===============================");
		
		}
		*/
	
	}
}
