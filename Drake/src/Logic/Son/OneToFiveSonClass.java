package Logic.Son;

import Logic.Parents.OneToFiveMotherClass;

public class OneToFiveSonClass extends OneToFiveMotherClass{

	int sonSum = 0;

	public OneToFiveSonClass(int a, int b[]) {
		super(a,b);
		for(int i = 0; i<=a; i++) {
			if(i%2!=0) {
				sonSum+=i;
			}
		}
		System.out.println("sonSum : "+sonSum);
	}
	
	

}

