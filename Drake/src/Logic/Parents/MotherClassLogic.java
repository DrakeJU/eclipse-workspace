package Logic.Parents;

import ClassData.MotherSonClassData;

public class MotherClassLogic {

	MotherSonClassData dd = new MotherSonClassData();	

	dd.korSum();


	public void totalSum() {

		System.out.print(" 합계 : "+sum[2]);
		System.out.println();

		for(int i =0;i<3;i++) {
			totalSum += sum[i];
		}
		System.out.println("총합은 : "+totalSum);

	}

}
