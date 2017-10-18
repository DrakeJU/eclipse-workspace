package Test.test;

public class ConstructorExam {
	//생성자
	//생성자는 객체를 만드는 순간에 한번 실행
	//사용자가 생성자를 만들지 않으면 컴파일러가 자동으로 생성
	//생성자의 이름은 클래스 명과 동일하고 리턴형이 없습니다.
	//대부분 public 접근 지정자를 사용하여 생성합니다.
	//생성자를 만드는 목적은 멤버 변수(전역변수)를 초기화시 주로 사용됩니다.	
			
	int a;
	public ConstructorExam() {
		a = 10;
	}
	
	public void ConstructorExam() {
		a = 10;
	}	/*public void ConstructorExam({ //x1
	a=10;
}*/ //생성자가 아니라 리턴값이 없는 멤버 함 

	public ConstructorExam(int a) {
		this.a = a;
	}
	
	public static void main(String[] args) {
		ConstructorExam ob1 = new ConstructorExam();
		ConstructorExam ob2 = new ConstructorExam(20);
		ConstructorExam ob3 = new ConstructorExam(30);
		
		System.out.println(ob1.a);
		System.out.println(ob2.a);
		System.out.println(ob3.a);		
	}
	

}
