package Test.aaa;

public class RecursionExam {
	static void hi(int n) {
		if (n<=0) {
			return;
		}
		hi(n-1); //재귀호출
		System.out.println("Call Number : "+n);
	}
	public static void main(String[] args) {
		hi(5);

	}

}
