package Test.aaa;

public class ThisConstructorExam {
	public ThisConstructorExam( ) { //x1
		System.out.println("안녕");//x2
	}
	public ThisConstructorExam(String s) {//x3
		this(); //x4 Class30()호출, x1 행으로 이동 
		System.out.println(s);//x5
	}
	
	public ThisConstructorExam(int a) { //x6
		this("반가워~~");//x7 Class30(String s) 호출, x2행으로 이동
		System.out.println(a);//x8
	}
	public static void main(String[]args) {
		ThisConstructorExam ob = new ThisConstructorExam(20);//x9
	}
}
