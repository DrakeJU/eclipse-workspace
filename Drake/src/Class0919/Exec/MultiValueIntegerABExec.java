package Class0919.Exec;


import Class0919.Logic.MultiValueIntegerABLogic;

public class MultiValueIntegerABExec {

	public static void main(String[] args) {

		MultiValueIntegerABLogic ob = new MultiValueIntegerABLogic();
		
		Integer a = new Integer(3);
		Integer b = new Integer(2);
		
		int A = ob.MutiValue(a, b);
		
		System.out.println("결과값은 : "+A);
	}

}
