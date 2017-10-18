package MainExec;

import Parents.Super_0913;
import SonPackage.Sub_0913;

public class SuperSubMain {

	public static void main(String[] args) {

		Super_0913 ob = new Sub_0913();
		//부모클래스 변수 = 자식클래스 정보 
		ob.a = 20;
		ob.hi(); //자식의 hi() 가 실행된다.
		//ob.b=30; ->에러, 참조 불가
		//ob.bye(); ->에러, 참조 불가 
		
	}

}
