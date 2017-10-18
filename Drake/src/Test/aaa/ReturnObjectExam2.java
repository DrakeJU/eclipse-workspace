package Test.aaa;

public class ReturnObjectExam2 {

	public static void main (String[]args) {
		ReturnObjectExam ob1 = new ReturnObjectExam("hello");
		ReturnObjectExam ob2 = ob1.getObject();
		
		ob2.key = "This is Object2 Key!";
		
		System.out.println(ob1.key);
		ReturnObjectExam obj1 = new ReturnObjectExam(10,20);
		ReturnObjectExam obj2 = obj1.twice();
		
		System.out.println(obj1.a+" "+obj1.b);
		System.out.println(obj2.a+" "+obj2.b);
		
		int[] arrAfive = new int [5];
				
		ReturnObjectExam[] arrRo = new ReturnObjectExam[5];
		
		arrRo[0] =obj1;
		arrRo[1] =obj2;
		
		System.out.println(arrRo[0].a);
		System.out.println(obj1.a);
	}
}
