package Class0921.Exec;

public class ExceptionExam {
	public void errProcess() {
		try {
			errMake();
		} catch(Exception e) {
			System.out.println("에러를 처리 합니다.");
			System.out.println(e.getMessage());
			System.out.println("에러추적 : ");
			e.printStackTrace();
		}
	}
	public void errMake() throws Exception{
		System.out.println("에러를 발생시킵니다.");
		throw new Exception("errMake()함수에서 에러가 발생하였습니다.");
	}

	public static void main(String[] args) {

		ExceptionExam exLogic = new ExceptionExam();
		exLogic.errProcess();
	}

}
