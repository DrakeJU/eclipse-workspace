package Test.aaa;

public class ConstructorExamError {

	int a;
	public ConstructorExamError() {
		System.out.println("인자가 없는 디폴트 생성");
	}
	public ConstructorExamError (int a) {
		this();//this 생성는 맨위에 넣어놔야한다.
		this.a=a;
	}
	public static void main(String[] args) {
		ConstructorExamError ob=new ConstructorExamError(2); //다른 생성
		//생성자를 자동으로 만들어주지 않는다.
		//따라서 만들어주어야 한다..
		//System.out.println(ob.a);
		
	}

}
