package Test.test;

public class ThisReference {
	int a;
	long myLong;
	
	void setA(int a) {
		this.a = a;
	}	
	int getA() {
		return a;	// 여기서 a는 this.a를 말한다.
	}
	
	void setMyLong(long lValue) {
		this.myLong = lValue;
	}
	long getMyLong() {
		return this.myLong;
	}
			
	public static void main(String[] args) {
		ThisReference ob = new ThisReference();
		ob.setA(1000);
		
		System.out.println(ob.a);
		System.out.println(ob.getA());
	}//main
}//ThisReference
