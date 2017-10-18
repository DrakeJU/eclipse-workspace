package MainExec;

import ClassData.OneToFiveMotherSonData;
import Logic.Son.OneToFiveSonClass;


public class OneToFiveMotherSonExec {


	static int i;

	public static void main(String[] args) {

		
		OneToFiveMotherSonData Data = new OneToFiveMotherSonData();
		
		Data.setNum(5);
		int[] aa= {1,2,3,4,5};
		OneToFiveSonClass ob = new OneToFiveSonClass(aa.length, aa);
		
		
		
		//Data.setA(aa);
		//OneToFiveMotherClass ob1 = new OneToFiveMotherClass(aa);
		
		//System.out.println(Data.getA(aa));
	}

}
