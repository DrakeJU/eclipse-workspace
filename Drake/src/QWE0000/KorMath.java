package QWE0000;

import Test.aaa.KorMathFunction;

public class KorMath {

	public static void main(String[] args) {
		
		int [][] aabb = {{10,40},{50,90}};
		int result = 0;
		KorMathFunction ob = new KorMathFunction();
			
		ob.korsum(aabb);
		System.out.println(ob.korsum(aabb));
		//KorMathFunction.korsum();
		//KorMathFunction.mathsum();

		
	}

}
