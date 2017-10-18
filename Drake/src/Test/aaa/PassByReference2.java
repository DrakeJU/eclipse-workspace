package Test.aaa;

public class PassByReference2 {

	private int a;
	
	public PassByReference2(int a) {
		this.a=a;
	}
	public void twice(PassByReference2 o) {
		o.a *=2;
	}
	public int getA() {
		return a;
	}
	void play (String name) {
		String a = name+"야 놀자.";
		System.out.println(a);
	}
	
}
