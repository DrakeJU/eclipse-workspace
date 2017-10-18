package Test.aaa;
class sample{
	int a,b,c;
}
public class Ave_01 {

	public static void main(String[] args) {
		
		sample abc;
		abc = new sample();
		
		abc.a=20;
		abc.b=40;
		abc.c=30;
		
		int d = abc.a+abc.b+abc.c;
		System.out.println(d/3);
	}

}
