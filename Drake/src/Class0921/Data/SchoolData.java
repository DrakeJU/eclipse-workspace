package Class0921.Data;

import java.util.*;

public class SchoolData implements Comparable<SchoolData> {

	int kor = -1;
	int math = -1;
	int eng = -1;
	int gym = -1;
	int count = 0;
	double avg;

	
	public void setKor(int a) {
		this.kor =a;
	}
	public int getKor() {
		return kor;
	}
	public void setEng(int b) {
		this.eng =b;
	}
	public int getEng() {
		return eng;
	}
	public void setMath(int c) {
		this.math =c;
	}
	public int getMath() {
		return math;
	}
	public void setGym(int d) {
		this.gym =d;
	}	
	public int getGym() {
		return gym;
	}
	public void setAvg(double f) {
		this.avg = f;
	}
	public double getAvg() {
		return avg;
	}
	public void setCount(int g) {
		this.count = g;
	}
	public int getCount() {
		return count;
	}
	
}
