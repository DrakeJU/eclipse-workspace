package Class0920.Exec;
class ExcepThrowsLogic{
	public void errProcess() {
		try {
			errMake();
			System.out.println("이건 출력 않됨");
		}catch(Exception e){
			System.out.println("에러를 처리합니다. 처리처리처리");
		}
	}
	
	public void errMake() throws Exception{
		System.out.println("에러를 발생합니다. 발생발생발생");
		throw new Exception();
	}
}
public class ExcepThrows {

	public static void main(String[] args) {

		ExcepThrowsLogic exLogic = new ExcepThrowsLogic();
		exLogic.errProcess();
	}

}
