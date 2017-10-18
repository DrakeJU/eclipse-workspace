package Logic.Son;

import ClassData.MotherSonClassData;
import Logic.Parents.MotherClassLogic;


//double 형으로 국영수 average 구하기

public class SonClassLogic extends MotherClassLogic {
	
	MotherClassLogic dd = new MotherClassLogic();
	MotherSonClassData ee = new MotherSonClassData();
	
	double korAve;
	double engAve;
	double finaltotal;
	int totalAve;
	

	public double totalAve(int totalSum) {
		ee.getTotalSum();
		double totalAve = ee.getTotalSum();
		return totalAve/3;	
	}
	
	public double getKorAve(int korSum) {
		return korSum/3;
	}

	

	

}
