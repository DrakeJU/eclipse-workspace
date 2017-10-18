package class0921Referance.school.exec;

import java.util.ArrayList;
import java.util.Random;

import class0921Referance.school.data.StudentData;
import class0921Referance.school.logic.SchoolLogics;

public class SchoolExec {

	public static void main(String[] args) {
		
		String[] arrNameSamples = new String[] {"단군","이성계","동명왕","박혁거세","관창","김유신","선덕여왕","장보고","대조영","의천"};
		String[] arrSubject = new String[] {"국어","영어","수학","체육"};
		int[]	 arrScoreSamples = new int[] {0,10,20,30,40,50,60,70,80,90,100};
		
		//////////////////// test(remove 없이하는) ~
		ArrayList<String> arrNames = new ArrayList<String>();
		Random randGen = new Random();

		while(arrNames.size() < 10) {
			int indexToGet = randGen.nextInt(arrNameSamples.length);
			int i = 0;
			for(i=0; i<arrNames.size(); i++) {
				if(arrNameSamples[indexToGet].equals(arrNames.get(i))) {
					break;
				}
			}
			if(i==arrNames.size()) {
				arrNames.add(arrNameSamples[indexToGet]);
			}
		}
		 /////////////////////
		
		ArrayList<StudentData> arrAllStudent = new ArrayList<StudentData>();
		
		ArrayList<String> arrNameList = new ArrayList<String>();
		ArrayList<String> arrSubjectList = new ArrayList<String>();
		
		for(int i=0; i<arrNameSamples.length; i++) {
			arrNameList.add(arrNameSamples[i]);
		}
		
		Random randGenerator = new Random();
		int nextIdxToGet = 0;
		String name;
		String nextSubject;
		while(arrNameList.size() > 0) {
			nextIdxToGet = randGenerator.nextInt(arrNameList.size());
			name = arrNameList.remove(nextIdxToGet);
			System.out.println(name);
			for(int i=0; i<arrSubject.length; i++) {
				arrSubjectList.add(arrSubject[i]);
			}
			Float kor = 0.0f;
			Float eng = 0.0f;
			Float mat = 0.0f;
			Float gym = 0.0f;
			while(arrSubjectList.size() > 0) {
				nextIdxToGet = randGenerator.nextInt(arrSubjectList.size());
				nextSubject = arrSubjectList.remove(nextIdxToGet);
				System.out.print(nextSubject);
				if(nextSubject.equals(arrSubject[0])) {
					kor = Float.valueOf(arrScoreSamples[randGenerator.nextInt(11)]);
					System.out.print(kor+"\n");
				}else if(nextSubject.equals(arrSubject[1])) {
					eng = Float.valueOf(arrScoreSamples[randGenerator.nextInt(11)]);
					System.out.print(eng+"\n");
				}else if(nextSubject.equals(arrSubject[2])) {
					mat = Float.valueOf(arrScoreSamples[randGenerator.nextInt(11)]);
					System.out.print(mat+"\n");
				}else if(nextSubject.equals(arrSubject[3])) {
					gym = Float.valueOf(arrScoreSamples[randGenerator.nextInt(11)]);
					System.out.print(gym+"\n");
				}
			}
			arrAllStudent.add(new StudentData(name, kor, eng, mat, gym));
			System.out.println();
		}
		
		SchoolLogics schoolLogic = new SchoolLogics();
		schoolLogic.getSortRankBy(SchoolLogics.TOT_SCORE, arrAllStudent);
		
		System.out.println("\n");
		System.out.println("\n평균석차\t이름\t국어\t수학\t영어\t체육\t평균");
		for(int i=0; i<arrAllStudent.size(); i++) {
			System.out.println((i+1) + "\t" + arrAllStudent.get(i).getName() 
					+ "\t" + arrAllStudent.get(i).getKor() 
					+ "\t" + arrAllStudent.get(i).getEng() 
					+ "\t" + arrAllStudent.get(i).getMat() 
					+ "\t" + arrAllStudent.get(i).getGym() 
					+ "\t" + arrAllStudent.get(i).getAvg());
		}
		
		float allSum = 0.0f;
		float allAvg = 0.0f;
		for(int i=0; i<arrAllStudent.size(); i++) {
			allSum += arrAllStudent.get(i).getAvg();
		}
		
		try {
			allAvg = allSum / arrAllStudent.size();
			if(allAvg <= 50f) {
				throw new Exception("평균 : " + allAvg + " 지도가 필요한 학급입니다.");
			} else {
				System.out.println("\n전체 평균 : " + allAvg);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println(e);
		}
	}//main
}//SchoolExec