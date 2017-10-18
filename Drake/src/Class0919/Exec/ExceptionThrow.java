package Class0919.Exec;

public class ExceptionThrow {

	public static void main(String[] args) {

		try {
			int a= 1;
			int b= 0;
			
			if(b == 0 ) {
				throw new Exception();
			}
			System.out.println("a*b : "+(a*b));
		}catch(Exception e) {
			System.out.println("입력된 숫자는 0이 될수 없습니다.");
		}
	}

}
