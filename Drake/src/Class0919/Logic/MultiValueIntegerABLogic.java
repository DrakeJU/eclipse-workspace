package Class0919.Logic;

public class MultiValueIntegerABLogic {
	
	//	1) a 와 b가 같면 a의a승
	//	2) a>b 이면 a*b*a*b*....(b번째까지 의 곱)
	//	3) a<b 이면 a*b*a*b*....(a번째까지 의 곱)
	
	public int MutiValue(Integer a, Integer b) {
		
		int result = 1;

		
		if (a.equals(b)) {
			for(int cnt = 1;cnt<=a;cnt++) {
				result = result*a;
			}
			return result;
			
		}else if((a.compareTo(b))>0) {
			for(int cnt = 1; cnt<=b; cnt++) {
				result*=a*b;
			}
			return result/b;
		
		}else if((a.compareTo(b))<0) {
			for(int cnt = 1; cnt<=a; cnt++) {
				result *= a*b;
			}
			return result;
		}
		
		return result;
	}
}
