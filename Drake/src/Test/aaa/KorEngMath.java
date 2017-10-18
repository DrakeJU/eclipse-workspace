package Test.aaa;

/* 배열 {{10,20,30,},{40,50,60},{70,80,90}}
 * 첫번째 국어 /두번째 영어 /세번째 수학 
 *국어 총합과 평균. 영어 총합과 평균. 수학 총합과 평균
 *전체 총합과 평균
 *최저 점수 과목별 점수 :국/영/수 
 */
public class KorEngMath {
	private int num;
	public KorEngMath() {
		
	}
	public KorEngMath(int aaa) {
			
		num = aaa;
		
		//System.out.println(num);
	}// num = subjectnumber.length;
	public KorEngMath(int[][] aaa) {


		int korsum = 0;
		int engsum = 0;
		int mathsum = 0;
		for(int i = 0; i<aaa.length ; i++) {
			for(int j=0; j<aaa.length; j++)
				if (j==0) {
					korsum = korsum + aaa[i][j];
				}else if(j==1) {
						engsum = engsum + aaa[i][j];
					}else if(j == 2) {
							mathsum = mathsum + aaa[i][j];
				}
		}
		System.out.println("국어 과목의 총 합 : "+korsum);
		System.out.println("영어 과목의 총 합 : "+engsum);
		System.out.println("수학 과목의 총 합 : "+mathsum);

		
	}

	public static void main(String[] args) {
		
		int[][] subjectnumber = {{10,20,30,},{40,50,60},{70,80,90}};
		
		KorEngMath q1 = new KorEngMath();
		KorEngMath q2 = new KorEngMath(subjectnumber.length);
		KorEngMath q3 = new KorEngMath(subjectnumber);
		
		System.out.println("국어 과목의 총 합 : "+korsum);
		System.out.println("영어 과목의 총 합 : "+engsum);
		System.out.println("수학 과목의 총 합 : "+mathsum);
		
		//System.out.println("국어의 합 : "+aaa.KorSum());
		
	}

}
