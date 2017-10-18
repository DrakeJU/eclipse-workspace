package Arithmetic.Exec;

import Arithmetic.Data.Inheritance_Data;
import Arithmetic.Logic.InherittanceLogic;

public class InheritanceExec {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Inheritance_Data aa = new Inheritance_Data();
		aa.setFirstNum(4);
		aa.setSecondNum(9);
		
		InherittanceLogic ob = new InherittanceLogic();
		int x = ob.sum(aa.getFirstNum(), aa.getSecondNum());
		System.out.println(x);
		int y = ob.minus(aa.getFirstNum(), aa.getSecondNum());
		System.out.println(y);
		
	}

}
