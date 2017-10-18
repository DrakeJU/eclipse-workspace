package Class0914.Exec;

import Class0914.Logic.Mother.ThirdMyInter2;

public class ThirdInterfaceExam implements ThirdMyInter2{

	public void method1() {
		System.out.println("Method1 Override");
	}
	public void method2() {
		System.out.println("Method2 override");
	}
	public static void main(String[] args) {
		ThirdInterfaceExam ob = new ThirdInterfaceExam();
		ob.method1();
		ob.method2();
	}

}
