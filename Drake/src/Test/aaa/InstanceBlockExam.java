package Test.aaa;

public class InstanceBlockExam {

	int a;
	{ //x1 인스턴스 블록 시작 
		System.out.println("인스턴트 블록");
		a=10;
	}//x2, 인스턴스 블록 끝 
	
	InstanceBlockExam(int a){
		System.out.println("생성자");
		this.a=a;
	}
	
	public static void main(String[]args) {
		InstanceBlockExam ob = new InstanceBlockExam(30);
		System.out.println(ob.a);
	}
}
