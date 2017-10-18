package Class0914.Exec;

import Class0914.Logic.Mother.MyInter;

public class FirstInterfaceExam implements MyInter{
								//interface는 implements로 상속받음
	public void method1() { // x1 오버라이드
		System.out.println("Method1 Override!");
	}
	public void method2(int a) { //x2 오버라이드
		System.out.println("Method2 Override!");
	}
	
	public static void main (String[]args) {
		FirstInterfaceExam ob = new FirstInterfaceExam();
		ob.method1();//x1행의 오버라이드 된 method1 호출
		ob.method2(123);//x2행의 오버라이드 된 method2 호출
		
		System.out.println(FirstInterfaceExam.MAX);//interface1은
		System.out.println(MyInter.MIN); //static 변수 객체 없이도 사용 가능
	}
}
