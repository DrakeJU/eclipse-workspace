package Arithmetic.Exec;

import Arithmetic.Data.ArithmeticPTData;
import Arithmetic.Logic.ArithmeticPTLogic;
import Arithmetic.Logic.InherittanceLogic;

public class ArithmeticPTExec {

	public static void main(String[] args) {
	
		ArithmeticPTData aa = new ArithmeticPTData();
		aa.setFirstNum(10);
		aa.setSecondNum(20);
		
		ArithmeticPTLogic bb = new ArithmeticPTLogic();
		
		int multi = bb.multi(aa.getFirstNum(),aa.getSecondNum());
		
		InherittanceLogic cc = new InherittanceLogic();
		int sum = cc.sum(aa.getFirstNum(),aa.getSecondNum());
		
//		System.out.print(aa.getFirstNum());
//		System.out.print(aa.getSecondNum());
		System.out.println("곱은? : "+multi);
		System.out.println("합은? : "+sum);
		
	}

}
