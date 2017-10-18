package Class0925.Exec;

public class CountinueExample {

	public static void main(String[] args) {

		int sum = 0;
		for (int i =1; i<=10;++i) {
			if(i % 2 !=0) {
				continue;
			}
			sum+=i;
		}System.out.println("1부터 10까지의 짝수의 합은 = "+sum);
		
		sum = 0;
		int loop = 0;
		while (loop<10) {
			loop++;
			if (loop %2 == 0) {
				continue;
			}
			sum+=loop;
		}
		System.out.println("1부터 10까지의 홀수의 합은 = "+sum);
	}

}
