package Test.aaa;

public class ThisReference {
/*
		int a;
	void setA(int a) {
		this.a = a;
	}
	
	int getA() {
		return a; // 여기서 a는 this.a를 말한다.
	}
	public static void main(String[] args) {
		ThisReference ob = new ThisReference();
		ob.setA(1000);
		
		System.out.println(ob.a);
		System.out.println(ob.getA());
*/
	
	
	long myLong;
	void setMylong(long x) {
		myLong = x;
	}
	
	long getMylong() {
		return myLong;
	}
	
	public static void main(String[] args) {
		ThisReference qq = new ThisReference();
		qq.setMylong(1000);
		
		System.out.println(qq.myLong);
		System.out.println(qq.getMylong());
	}//main
}//ThisReference
