package ClassData;

public class MotherSonClassData {

	int []a;
	int []b;
	int []c;
	int []korSum  = new int[3];
	int []engSum = new int[3];
	int []mathSum = new int[3];
	int sum [] = new int[3];

	public MotherSonClassData(int[] a, int []b,int []c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}
	public void Array1(int a[], int b[], int c[]){

		korSum[0] = a[0];
		korSum[1] = b[0];
		korSum[2] = c[0];

		engSum[0] = a[1];
		engSum[1] = b[1];
		engSum[2] = c[1];

		mathSum[0] = a[2];
		mathSum[1] = b[2];
		mathSum[2] = c[2];

		System.out.print("국어 : ");
		for(int i =0; i<3; i++) {
			System.out.print(korSum[i]+"  ");
			sum[0] += korSum[i];
		}
		System.out.print(" 합계 : "+sum[0]);
		System.out.println();
		System.out.print("영어 : ");
		for(int i =0; i<3; i++) {
			System.out.print(engSum[i]+"  ");
			sum[1] += engSum[i];
		}
		System.out.print(" 합계 : "+sum[1]);
		System.out.println();
		System.out.print("수학 : ");
		for(int i =0; i<3; i++) {
			System.out.print(mathSum[i]+"  ");
			sum[2] +=mathSum[i];
		}
	}
	
	public int[] getKorSum() {
		return korSum;
	}
	public void setkorSum(int[] korSum) {
		this.korSum = korSum;

	}


	public int [] getEngSum() {
		return engSum;
	}
	public void setEngSum(int [] engSum) {
		this.engSum = engSum;
	}


	public int[] getMathSum() {
		return mathSum;
	}
	public void setMathSum(int[] mathSum) {
		this.mathSum = mathSum;
	}

	int totalSum;
	public int getTotalSum() {
		return totalSum;
	}
	public void setTotalSum(int totalSum) {
		this.totalSum = totalSum;
	}

}
