package Class0915.Exec;

import java.util.ArrayList;

import Class0915.Data.ArryListExamData;
class Data{
	String name;
	int kor;
	int eng;
	
	public Data(String name, int kor, int eng) {
		this.name = name;
		this.kor = kor;
		this.eng = eng;
	}
	
}



public class ArrayListExamExec {

	public static void main(String[] args) {
	
		Data d1 = new Data("메롱",5,3);
		//d.name = "홍길동"
		
		ArrayList arrayhong = new ArrayList<>();
		
		arrayhong.add(d1);
		
		Data x = null;
		for(int i = 0; i<arrayhong.size();i++) {
			System.out.println((d1)(arrayhong.get(i)));
			x = (Data)arrayhong.get(i);
			System.out.println(x.kor);
			System.out.println(((d1)(arrayhong.get(i))).name);
		}
	}

}
