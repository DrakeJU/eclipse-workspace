package class0921Referance.school.logic;

import java.util.ArrayList;

import class0921Referance.school.data.StudentData;



public class SchoolLogics {

	public static final int KOR_SCORE = 0; 
	public static final int ENG_SCORE = 1;
	public static final int MAT_SCORE = 2;
	public static final int GYM_SCORE = 3;
	public static final int TOT_SCORE = 4;
	public static final int AVG_SCORE = 5;
		
	public StudentData getTopRankBy(int columnToCompare, ArrayList<StudentData> arrStudent) {
		
		StudentData topStudent = arrStudent.get(0);

		for(int i=1; i<arrStudent.size(); i++) {
			switch(columnToCompare) {
			case KOR_SCORE:
				if(topStudent.getKor() < arrStudent.get(i).getKor()) {
					topStudent = arrStudent.get(i);	
				}
				break;
			case ENG_SCORE:
				if(topStudent.getEng() < arrStudent.get(i).getEng()) {
					topStudent = arrStudent.get(i);	
				}
				break;
			case MAT_SCORE:
				if(topStudent.getMat() < arrStudent.get(i).getMat()) {
					topStudent = arrStudent.get(i);	
				}
				break;
			case TOT_SCORE:
				if(topStudent.getTot() < arrStudent.get(i).getTot()) {
					topStudent = arrStudent.get(i);	
				}
				break;
			case AVG_SCORE:
				if(topStudent.getAvg() < arrStudent.get(i).getAvg()) {
					topStudent = arrStudent.get(i);	
				}
				break;
			}
		}		
		return topStudent;
	}//getTopRankBy
	
	public StudentData getTopRankBy(int columnToCompare, StudentData[] arrStudent) {
		
		StudentData topStudent = arrStudent[0];

		for(int i=1; i<arrStudent.length; i++) {
			switch(columnToCompare) {
			case KOR_SCORE:
				if(topStudent.getKor() < arrStudent[i].getKor()) {
					topStudent = arrStudent[i];	
				}
				break;
			case ENG_SCORE:
				if(topStudent.getEng() < arrStudent[i].getEng()) {
					topStudent = arrStudent[i];	
				}
				break;
			case MAT_SCORE:
				if(topStudent.getMat() < arrStudent[i].getMat()) {
					topStudent = arrStudent[i];	
				}
				break;
			case TOT_SCORE:
				if(topStudent.getTot() < arrStudent[i].getTot()) {
					topStudent = arrStudent[i];	
				}
				break;
			case AVG_SCORE:
				if(topStudent.getAvg() < arrStudent[i].getAvg()) {
					topStudent = arrStudent[i];	
				}
				break;
			}
		}		
		return topStudent;
	}//getTopRankBy
	
	
	public StudentData[] getSortRankBy(int columnToCompare, StudentData[] arrStudent) {
		
		StudentData tempStudent = null;
		
		for(int i=0; i<arrStudent.length-1; i++) {
			for(int j=i+1; j<arrStudent.length-1; j++)
				switch(columnToCompare) {
				case KOR_SCORE:
					if(arrStudent[i].getKor() < arrStudent[j].getKor()) {
						tempStudent = arrStudent[i];
						arrStudent[i] = arrStudent[j];
						arrStudent[j] = tempStudent;
					}
					break;
				case ENG_SCORE:
					if(arrStudent[i].getEng() < arrStudent[j].getEng()) {
						tempStudent = arrStudent[i];
						arrStudent[i] = arrStudent[j];
						arrStudent[j] = tempStudent;	
					}
					break;
				case MAT_SCORE:
					if(arrStudent[i].getMat() < arrStudent[j].getMat()) {
						tempStudent = arrStudent[i];
						arrStudent[i] = arrStudent[j];
						arrStudent[j] = tempStudent;	
					}
					break;
				case TOT_SCORE:
					if(arrStudent[i].getTot() < arrStudent[j].getTot()) {
						tempStudent = arrStudent[i];
						arrStudent[i] = arrStudent[j];
						arrStudent[j] = tempStudent;	
					}
					break;
				case AVG_SCORE:
					if(arrStudent[i].getAvg() < arrStudent[j].getAvg()) {
						tempStudent = arrStudent[i];
						arrStudent[i] = arrStudent[j];
						arrStudent[j] = tempStudent;	
					}
					break;
				}
		}
		return arrStudent;
	}//getSortRankBy
	
	
	
	public ArrayList<StudentData> getSortRankBy(int columnToCompare, ArrayList<StudentData> arrStudent) {
		
		StudentData tempStudent = null;
		
		for(int i=0; i<arrStudent.size()-1; i++) {
			for(int j=i+1; j<arrStudent.size(); j++)
				switch(columnToCompare) {
				/*
				case KOR_SCORE:
					if(arrStudent.get(i).getKor() < arrStudent.get(j).getKor()) {
						tempStudent = arrStudent.get(i);
						arrStudent.get(i) = arrStudent.get(j);
						arrStudent[j] = tempStudent;
					}
					break;
				case ENG_SCORE:
					if(arrStudent[i].getEng() < arrStudent[j].getEng()) {
						tempStudent = arrStudent[i];
						arrStudent[i] = arrStudent[j];
						arrStudent[j] = tempStudent;	
					}
					break;
				case MAT_SCORE:
					if(arrStudent[i].getMat() < arrStudent[j].getMat()) {
						tempStudent = arrStudent[i];
						arrStudent[i] = arrStudent[j];
						arrStudent[j] = tempStudent;	
					}
					break;
				case GYM_SCORE:
					if(arrStudent[i].getMat() < arrStudent[j].getMat()) {
						tempStudent = arrStudent[i];
						arrStudent[i] = arrStudent[j];
						arrStudent[j] = tempStudent;	
					}
					break;
					*/
				case TOT_SCORE:
					if(arrStudent.get(i).getTot() < arrStudent.get(j).getTot()) {
						tempStudent = arrStudent.get(i);
						arrStudent.set(i, arrStudent.get(j));
						arrStudent.set(j, tempStudent);
					}
					break;
				case AVG_SCORE:
					if(arrStudent.get(i).getAvg() < arrStudent.get(j).getAvg()) {
						tempStudent = arrStudent.get(i);
						arrStudent.set(i, arrStudent.get(j));
						arrStudent.set(j, tempStudent);
					}
					break;
				}
		}
		return arrStudent;
	}//getSortRankBy
	
}//ScoreTableLogics
