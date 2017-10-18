package MainExec;

import Parents.OverrideParent;

public class OverrideExam extends OverrideParent{

	protected int a = 20;  // 오버라이드
	
	void f() {
		System.out.println(super.a);//부모부터 물려받은 멤버, 10 출력
		System.out.println(this.a);//자식이 다시 정의한 멤버, 20 출
	}
	
	public void hello() {//오버라이드 
		super.hello();// 상속받은 hello() 호출 
		System.out.println("son hello()"); //기능확장
	}
	public static void main (String[]args) {
		OverrideExam ob = new OverrideExam();
		ob.f();
		ob.hello();
	}
}

