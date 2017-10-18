package ArithmeticExam.Exec;

import ArithmeticExam.Data.ArithmeticData;
import ArithmeticExam.Logic.ArithmeticExamLogic;

public class ArithmeticExamExec {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArithmeticData oob = new ArithmeticData();
		oob.setFirstNum(3);
		oob.setSecondNum(5);
		
		
		
		ArithmeticExamLogic ob = new ArithmeticExamLogic();
		
		int x = ob.minous(oob.getFirstNum(),oob.getSecondNum());
		System.out.println(x);
	}

}
