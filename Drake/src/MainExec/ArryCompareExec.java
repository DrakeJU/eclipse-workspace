package MainExec;

import ClassData.ArryCompareData;

public class ArryCompareExec {

	public static void main(String[] args) {

		ArryCompareData [] qwe = new ArryCompareData[2];
		
		int a[] = {1,2,3,4,5};
		int b[] = {2,1,3,4,5};
		
		ArryCompareData d1 = new ArryCompareData();
		ArryCompareData d2 = new ArryCompareData();
		
		d1.setArry(a);
		d2.setArry(b);
		
		qwe[0] = d1;
		qwe[1] = d2;
		
	}

}
