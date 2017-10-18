package Test.aaa;

import ClassData.MotherSonClassData;
import Logic.Parents.MotherClassLogic;
import Logic.Son.SonClassLogic;

public class MotherSonMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] a = {10,20,30};
		int[] b = {40,50,60};
		int[] c = {70,80,90};
		
		MotherSonClassData aa = new MotherSonClassData(a,b,c);
		MotherClassLogic bb = new MotherClassLogic();
		SonClassLogic cc = new SonClassLogic();
		
//		bb.Array1(a, b, c);
		aa.korarry();
		//
//		bb.totalSum();
		
		
	}

}
