package Test.aaa;

public class SetGetMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		PrivateClass ob = new PrivateClass();
		
		//ystem.out.println(ob.num);
		ob.getNum();
		System.out.println(ob.getNum());
		ob.setNum(30);
		ob.getNum();
		
		System.out.println(ob.getNum());
	}

}
