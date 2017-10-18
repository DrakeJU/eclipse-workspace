package Class0921.Exec;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Random;

import Class0921.Data.Student;

public class SchooooolwithSam {

	public static void main(String[] args) {
		
		
		String[] name = {"단군","이성계","동명왕","박혁거세","관창","김유신","선덕여왕","장보고","대조영","의천"}; //10명
		String[] subjects = {"국어","영어","수학","체육"};//4과목
		int []	subNum = {100,90,80,70,60,50,40,30,20,10,0};//10~100 점 //11개
		
		Random r = new Random();
		
		
		
		ArrayList<Student> studentList = new ArrayList<Student>();
		
		// Setting up student List
		for(int i =0; i< name.length; i++) {
			
			HashMap<String, Integer> scoreMap = new HashMap<String, Integer>();
			
			// Setting up score map : map subject with randomly picked score
			for(int j = 0; j < subjects.length; j++) {
				scoreMap.put(subjects[j], subNum[r.nextInt(10)+0]);
			}
			
			// Declare student with generated data
			Student student = new Student(name[i], scoreMap);
			
			// Add it to student list
			studentList.add(student);
		}
		
		ArrayList<Student> goodStudent = new ArrayList<Student>();
		ArrayList<Student> badStudent = new ArrayList<Student>();
		
		for ( Student currentStudent : studentList ) {
			String currentStdName = currentStudent.getName();
			HashMap<String, Integer> currentScoremap = currentStudent.getScoremap();
			Double currentStdAvg = currentStudent.getAvg();
			
			
			System.out.println(currentStdName);
			
			// Print Score map
			Iterator it = currentScoremap.keySet().iterator();
			while(it.hasNext()) {
				String key = (String)it.next();
				Integer score = currentScoremap.get(key);
				System.out.println("subject: " + key + " => " + score);
			}
			System.out.println("평균 : "+ currentStdAvg);
			System.out.println("========================");
			
			// Decide which student is good
			if (currentStdAvg >= 50) {
				goodStudent.add(currentStudent);
			} 
			else {
				badStudent.add(currentStudent);
			}
		}
		
		// Sort only good student by avg score
		Collections.sort(goodStudent, sortByAvg);
		
		System.out.println("Good Student=============");
		for ( Student currentStudent : goodStudent ) {
			System.out.println(currentStudent.getName() +":" + currentStudent.getAvg());
		}
		
		/*
		for( int i=0; i<goodStudent.size(); i++ ) {
			Student currentStudent = goodStudent.get(i);
		}
		*/
		
		System.out.println("Bad Student=============");
		for ( Student currentStudent : badStudent ) {
			System.out.println(currentStudent.getName() +":" + currentStudent.getAvg());
		}
		
	}
	
	public static Comparator<Student> sortByAvg = new Comparator<Student>() {

		public int compare(Student s1, Student s2) {

		   int av1 = (int)s1.getAvg();
		   int av2 = (int)s2.getAvg();

		   return av2-av1;
	   }
	};
}

