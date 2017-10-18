package Test.aaa;
class Man{
	int height;
	int age;
}//Man
public class FirstClass {		//클래스 정의 
	public static void main(String[] args) {
		Man man1;
		man1=new Man();
		
		man1.height=180;
		man1.age=20;
		
		System.out.println(man1.height);
		System.out.println(man1.age);
	}//main

}//Firstclass
