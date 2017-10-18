package MainExec;

import Parents.SuperCast0913;

public class ObjectCast0913 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SuperCast0913 ob1 = new SuperCast0913();
		SuperCast0913 ob2 = new (SuperCast0913)ob1;
		
		ob1.hi();
		ob2.hi();
		ob2.bye(); //ob1은 bye()를 호출할 수 없다.
		
	}

}
