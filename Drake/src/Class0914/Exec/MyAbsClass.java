package Class0914.Exec;

public abstract class MyAbsClass {

	// 추상 메소드를 포함 하는 클래스
	// 객체로 생성할 수 없다.
	// abstract 메소드는 private 또는  static이 될 수 없다.
	// (static 메소드는 객체없이도 호출 되는 메소드 이므로 body가 정의 되어야 한다.)
	
	int myInt;
	public abstract void noAction(); //x1 추상메소드
	
	public int getMyInt() {
		return myInt;
	}	
	//MyabsClass ab = new MyAbsClass(); 객체로 생성할수없는 예
}