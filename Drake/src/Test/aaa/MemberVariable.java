package Test.aaa;

public class MemberVariable {
	int a;
	int b=100;
	
	String c;  
	String d="변수 테스트";
	//전역변수의 경우 값을 정하지 않으면 디폴트값으로 정해
	public static void main(String[] args) {
		
		MemberVariable qwe = new MemberVariable();
		
		System.out.println(qwe.a);
		System.out.println(qwe.b);
		System.out.println(qwe.c); //null 출력됨 null은 아무것도 아닌 공간 
		System.out.println(qwe.d);
		int localVariable;
		/*System.out.println(localVariable);*/  //에러 = 지역변수는 값을 항상설정해야 
	}//main

}//MemberVarialble
