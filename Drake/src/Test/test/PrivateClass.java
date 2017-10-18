package Test.test;

public class PrivateClass {
	private int num;
	
	void setNum(int value) {
		this.num = value;
	}
	int getNum() {
		return this.num;
	}
	
	private void callPrivate() {
		System.out.println("Call Private Function");
	}
	
	public void call() {
		System.out.println("Call Private Function");
	}

}
