package Test.aaa;

public class KorMathFunction {
	
	
	
	
	public int korsum(int[][] aabb) {
	
		int korsum=0;
		
		for (int i = 0; i<2 ; i++) {
			for(int j =0; j<2 ; j++) {
				if(j==0) {
					korsum = korsum + aabb[i][j];
				}//if 
			}//j for
			
		}// i  for
		//System.out.println(korsum);
		return korsum;
	}
		
	public int mathsum(int[][] aabb) {
		
		int mathsum=0;
		
		for (int i = 0; i<2 ; i++) {
			for(int j =0; j<2 ; j++) {
				if(j==1) {
					mathsum = mathsum + aabb[i][j];
				}// if j end
			}// for j end
			
		}// for i end
		return mathsum;

	}//mathsum end
	
}//class end
