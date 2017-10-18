package Class0919.Logic;

public class MorningFunctionExam {

	//문자열에서 느낌표가 몇개 있는지 카운트 하는 (함수)를 만드시오.
	
	public int countCheck(String a) {
		
		int countCheck=0;
		
		for(int i = 0; i<a.length();i++) {
		
			if(a.charAt(i) == '!') {
				countCheck+=1;
			}
		}
		return countCheck;
	}
}
