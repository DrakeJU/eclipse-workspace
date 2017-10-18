package Class0926.Exec;

public class RecursionTestingAlone {
	static int throwDices(){
		int dice1 = (int)(Math.random()*6+1);
		int dice2 = (int)(Math.random()*6+1);
		
		int total = dice1+ dice2;
		
		System.out.println("다이스 1의 값 : "+dice1 +" ||||| "+" 다이스 2의 값 : "+dice2);
		if(dice1 == dice2) {
			return total + throwDices();
		}
		return total;
	}
	
	public static void main(String[] args) {
		
		System.out.println(throwDices());
	}

}
