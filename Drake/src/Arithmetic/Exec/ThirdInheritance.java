package Arithmetic.Exec;

import Parents.ThirdParent;

public class ThirdInheritance extends ThirdParent{
	int b;
	ThirdInheritance(int a, int b){
		super(a); //x4 super의 위치는 제일 처음에 위치해야한다. this 와 같은 취급.
		this.b=b; //x5
	}// super 는 부모 클래스에 있는 생성자를 호출한다.
	
	public static void main (String[]args) {
		ThirdInheritance ob = new ThirdInheritance(10,20); //x6
		System.out.println(ob.a+" "+ob.b); //x7
	}
}
