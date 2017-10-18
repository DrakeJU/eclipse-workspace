package Logic.Parents;

import ClassData.TwoArryData;

public class TwoArryMother {
	int sum = 0 ;

	TwoArryData data = new TwoArryData();
	
	public TwoArryMother(TwoArryData[] a){
		
		for(int i = 0 ; i < a.length ; i++) {
			
			for(int j = 0 ; j < a[i].getFirtsArry().length ; j++) {
				sum += (a[i].getFirtsArry())[j];
			}
		}
	}
	
	public int getSum() {
		return sum;
	}
}
