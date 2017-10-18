package Test.aaa;

public class StaticExam {
	
	static int a; //static변수 
	int b; //멤버 변수 
	
	static int return123() {
		return 123;
	}
	public static void main(String[] args) {
		
		StaticExam.a =10; //x1
		StaticExam ob1 = new StaticExam();
		StaticExam ob2 = new StaticExam();
		
		System.out.println(ob1.a);
		ob1.a = 20;
		System.out.println(ob2.a);
		ob2.a = 30;
		System.out.println(StaticExam.a);
		
		//System.out.println(StaticExam.b); //non-static 변수는 객체를 만들어서 사용가능 
		
		System.out.println(ob1.return123());//Static method는 객체를 생성해서라도 사용가능 
		System.out.println(StaticExam.return123());//static method는 객체 생성 없이도사용가능 
		

	}

}
