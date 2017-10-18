package Test.aaa;

public class Recursiononetwothree {
	
	static int sum = 0;
	static int onetofive(int n) {
		if(n<=0) {
			return 0;
		}
		sum = sum + n;
		onetofive(n-1);
		System.out.println("불림받은 숫자는? "+n+" "+sum);
		return sum;
	}
	public static void main (String[]args) {
		onetofive(5);
	}
	
	
}
