package Class0925.Exec;

public class LabelExample {
	public static void main (String[] args) {
		int [] numbers = new int[] {100,10,21,30};
		
		OUTER:
		for(int i = 0; i<numbers.length;i++) {
			if(i%2 ==0) {
				System.out.println("홀수 : "+i+", continue, OUTER label 이동");
				continue OUTER;
				
			}
		}
		INNER:
		for(int j = 0; j<numbers.length;j++) {
			System.out.println("짝수 : "+j+", break, INNER label 종료");
			break INNER;
		}
	}
}
