package Test.aaa;

public class PrivateClass {
	
	private int num = 10;

	public void setNum(int num) {
		this.num = num;
	}
	public int getNum() {
		return num;
	}
	
	private void callPrivate() {
		System.out.println("Call Private Function");
		
	}
	
	public void call() {
		System.out.println("Call private Function");
	}

}
