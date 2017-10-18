package Class0919.Exec;

public class IntegerCompare {

	public static void main(String[] args) {
		Integer intObj1 = new Integer (25);
		Integer intObj2 = new Integer ("25");
		Integer intObj3 = new Integer (35);
		//compareTo Demo
		System.out.println("비교(크기) Obj1와 Obj2 : "+ intObj1.compareTo(intObj2));
		System.out.println("비교(크기) Obj1 and Obj3 : "+ intObj1.compareTo(intObj3));
		//Equals Demo
		System.out.println("비교(등가) 	Obj1 and Obj2 : "+ intObj1.equals(intObj2));
		System.out.println("비교(등가)	Obj1 and Obj3 : "+ intObj1.equals(intObj3));
		System.out.println("참조 비교 : "+ (intObj1==intObj2));
		Float f1 = new Float ("2.25f");
		Float f2 = new Float ("20.43f");
		Float f3 = new Float (2.25f);
		System.out.println("비교(크기) f1 and f2 "+ Float.compare(f1,f2));
		System.out.println("비교(크기) f1 and f3 "+ Float.compare(f1, f3));
		//

	}

}
//compareTo 는 앞뒤에 있는 객체를 비교해준다
