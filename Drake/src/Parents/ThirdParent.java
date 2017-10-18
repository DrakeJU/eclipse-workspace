package Parents;

public class ThirdParent {

	protected int a;
	ThirdParent(){ //x1 생성자 
		a = 1;
	}
	//protected : package가 상이할시에도 상속시 자식 클래스에서 접근가능한 접근 지정자.
	protected ThirdParent(int a){//x2 생성
		this.a=a;
	}

}
