package Class0915.Exec;

import Class0915.Data.StringKorEngMathData;

public class StringKorEngMath {

	public static void main(String[] args) {

/*		
		국어 최고 점수:
			이름: 허균
			점수:90
		영어 최고점수 :
			이름: 홍길동
			점수: 90
		수학 최고점수 :
			이름: 이순신
			점수: 95
		석차
		1등:
			이름:
			평균:
		2등:
			이름:
			평균:
		3등:
			이름:
			평균:
*/
		
		String hong = "홍길동^60^90^70";
		String heo = "허균^90^80^60";
		String lee = "이순신^70^50^95";
		
		//이름
		String onlyhong = hong.substring(0,3);
		String onlyheo = hong.substring(0,1);
		String onlylee = lee.substring(0,3);
		//kor string형
		String khong = hong.substring(4, 6);
		String kheo = heo.substring(3, 5);
		String klee = lee.substring(4, 6);
		//eng string형
		String ehong = hong.substring(7,9);
		String eheo = heo.substring(6,8);
		String elee = lee.substring(7,9);
		//math string형
		String mhong = hong.substring(10,12);
		String mheo = heo.substring(9,11);
		String mlee = lee.substring(10,12);
		
		//int aa = Integer.valueOf("10"); // 문자열 "10을 " 숫자로 변환하는
		//String 형의 숫자 값들을 int형으로 변환;
		int khong1 = Integer.valueOf(60);
		int kheo1 = Integer.valueOf(90);
		int klee1 = Integer.valueOf(70);
		//-----------------------------//
		int ehong1 = Integer.valueOf(90);
		int eheo1 = Integer.valueOf(80);
		int elee1 = Integer.valueOf(50);
		//-----------------------------//
		int mhong1 = Integer.valueOf(70);
		int mheo1 = Integer.valueOf(60);
		int mlee1 = Integer.valueOf(95);
		
		//배열 선언해주자
		String[] name = {onlyhong,onlyheo,onlylee};
		int[] koreanNum = {khong1,kheo1,klee1};
		int[] englishNum = {ehong1,eheo1,elee1};
		int[] mathNum = {mhong1,mheo1,mlee1};
		
		StringKorEngMathData d1 = new StringKorEngMathData();
		
		d1.setName(name);
		d1.setKoreanNum(koreanNum);
		d1.setMathNum(mathNum);
		d1.setEnglishNum(englishNum);
		
		
		
		
		
	}

}
