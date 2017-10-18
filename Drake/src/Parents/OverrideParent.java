package Parents;

//부모의 멤버변수 또는 멤버함수를 다시 재정의 하는것
//방법
//1) 멤버 변수 오버라이드 : 변수의 이름이 같다.
//2) 멤버 메소드 오버라이드 : 리턴형, 메소드 이름, 매개 변수가 모두 같다.

public class OverrideParent {
	
	protected int a = 10;  //protected는 상속받은 자식 클레스에서만 쓸수있 
	
	protected void hello() {
		System.out.println("Super hello()");
	
	}
}
