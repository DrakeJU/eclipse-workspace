package Test.test;


class Man{
	int height;
	int age;
}//Man

class Sample{
	int a = 10;
	int b = 20;
	int c = 30;
}

public class FirstClass {
	public static void main(String[] args) {
		
		Man man1;
		
		man1 = new Man();
		
		man1.height = 180;
		man1.age = 20;
		
		System.out.println(man1.height);
		System.out.println(man1.age);
		
		Sample sample = new Sample();
		
		System.out.println("Average : " + ((sample.a + sample.b + sample.c)/3.0));
		
	}//main
}//FirstClass
