package Class0920.Exec;

public class ExceptionExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10, b01=0, b02=2, c=10;

		System.out.println("try 구문 수행하기전의 C -->"+c);

		try {
			System.out.println("try 구문으로 들어옴");
			System.out.println("나누기 연산하기전 try 구문");

			c = a /b02; //x1
			System.out.println("1. c = "+c);
			c = a /b01; //x2
			System.out.println("2. c = "+c);
			c = a /b02; //x3
			System.out.println("3. c = "+c);

		}catch(ArithmeticException e) {
			System.out.println("예외가 발생되어 ArithmeticException 객체가 잡음-->."+e);
		}catch(Exception e){
			System.out.println("예외가 발생되어 Exception 객체가 잡음-->."+e);
		}
		finally {
			System.out.println("try/catch 구문에 대한 정리 작업 c-->"+c);
		}
	}

}
