package Class0914.Exec;


import Class0914.Logic.Mother.SecondMyInter1;
import Class0914.Logic.Mother.SecondMyInter2;
import Class0914.Logic.Son.MyClass;

public class SecondInstanceExam extends MyClass implements SecondMyInter1,SecondMyInter2{
	
	public void method1() {//구현
		System.out.println("Method1 Override");		
	}
	public void method2() {//구현
		System.out.println("Method2 Override");
	}
	
	public static void main (String[]args) {
		SecondInstanceExam ob = new SecondInstanceExam();
		ob.method1();
		ob.method2();
		ob.hi();
	}
}
