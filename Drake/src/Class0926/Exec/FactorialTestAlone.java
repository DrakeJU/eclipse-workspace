package Class0926.Exec;

import java.util.Random;

public class FactorialTestAlone {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Random r = new Random();
		int a = r.nextInt(10)+1;
		
		int fac =1;
		for (int i = a; i>=1;i--) {
			fac *=i;
		}
		System.out.println("랜덤 수는 : "+a);
		System.out.println(a+" ! = : "+fac);
	
	}

}
