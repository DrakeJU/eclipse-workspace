package Logic.Parents;

import ClassData.OneToFiveMotherSonData;

public class OneToFiveMotherClass {
	int mothersum = 0;
	OneToFiveMotherSonData data = new OneToFiveMotherSonData();

	public OneToFiveMotherClass(int a, int aa[]) {

		for (int i = 0; i<a; i++) {
			int sum = 0;
			sum = sum + a;
			if(i<a) {
				mothersum += i;
			}
		}
		
		int arrysum = 0;
		for (int i = 0; i<aa.length; i++) {
			
			
			arrysum += aa[i];
			
		}
		System.out.println("Sum : "+arrysum);
	}
}

	
	
	


