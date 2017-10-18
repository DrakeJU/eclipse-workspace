package Arithmetic.Exec;

import Arithmetic.Data.DataArithmetic;
import Arithmetic.Logic.LogicArithmetic;

public class ExecArithmetic {
	
	public static void main(String[]args) {
	DataArithmetic ad = new DataArithmetic();
	ad.setFirstNum(1);
	ad.setSecondNum(2);
	
	
	LogicArithmetic a1 = new LogicArithmetic();
	int x = a1.sum(ad.getFirstNum(), ad.getSecondNum());
	
	
	System.out.println("x의 값은 : "+x);
	
	}
}
