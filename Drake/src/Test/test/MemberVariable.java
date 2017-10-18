package Test.test;

public class MemberVariable {

	int a;
	int b = 100;
	String c;  
	String d="변수 테스트";
	//전역변수의 경우 값을 정하지 않으면 디폴트값으로 정해
	
	public static void main(String[] args) {
		MemberVariable ob = new MemberVariable();
		
		System.out.println(ob.a);
		System.out.println(ob.b);
		System.out.println(ob.c); //null 출력됨 null은 아무것도 아닌 공간 
		System.out.println(ob.d);
		
		int localVariable;
		//System.out.println(localVariable);
	}//main
	
	
}//MemberVariable
