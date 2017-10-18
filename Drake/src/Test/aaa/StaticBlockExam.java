package Test.aaa;

public class StaticBlockExam {
	static int b;
		static { //x1
			System.out.println("static block call!"); //x2
			b = 30; //x3, static 맴버만 올 수 있다.
		}
		public static void main(String[]args) {
			System.out.println("Main Block Start");//x4
			System.out.println(b);//x5
		}
		//static 이 있으면 먼저 읽힌다.
}
