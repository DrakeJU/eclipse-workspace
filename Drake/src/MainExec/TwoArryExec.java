package MainExec;

import ClassData.TwoArryData;
import Logic.Parents.TwoArryMother;

public class TwoArryExec {

	public static void main(String[] args) {

		TwoArryData [] a = new TwoArryData[2];
		int [] A = {1,2,3,4,5};
		int [] B = {6,7,8,9,10};
		
		TwoArryData d1 = new TwoArryData();
		TwoArryData d2 = new TwoArryData();
		
		d1.setFrisrtArry(A);
		d2.setFrisrtArry(B);
		//TwoArryMother m1 = new TwoArryMother(a);
		
		a[0] = d1;
		a[1] = d2;
		
		TwoArryMother m1 = new TwoArryMother(a);
		System.out.println(m1.getSum());
		

		
	}

}
