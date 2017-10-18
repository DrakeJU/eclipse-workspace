package Test.aaa;

public class PassByReference3 {

	public static void main(String[] args) {
		PassByReference2 ob = new PassByReference2(100);

		
		ob.twice(ob);
		
		System.out.println("ob "+ob.getA());
		ob.play(new String("철수"));
	}

}
