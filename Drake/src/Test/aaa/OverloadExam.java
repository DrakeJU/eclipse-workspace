package Test.aaa;

public class OverloadExam {
	/*public/private/...*/void hi() {
		System.out.println("안녕!!");
	}
	void hi (String name) {
		System.out.println(name+"씨 안녕~");
	}
	/*String hi (String name) {
		return name;
	} //에러 발생 리턴값으로는 함수 Overload 할 수 없다.
	 */
	void hi (String name1, String name2) {
		System.out.println(name1+"씨, " + name2+"씨 안녕~~");
	}
	
	static boolean isSame(int a, int b) {
		System.out.println("int실행");
		return a==b;
	}
	static boolean isSame(long a, long b) {
		System.out.println("long실행");
		return a==b;
	}
/*boolean을 쓸때에는 무조건 함수 이름이 is로 시작하게 한다. */
	static boolean isSame(float a, float b) {
		return a ==b;
	}
	public static void main (String[]args) {
		OverloadExam ob = new OverloadExam();
		ob.hi();
		ob.hi("철수씨");
		ob.hi("명희씨","희경씨");
		
		System.out.println(isSame(1,2)); //첫번째 
		System.out.println(isSame(1.2f,1.2f)); //두번째 
		
	}
}