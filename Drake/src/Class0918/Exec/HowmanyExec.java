package Class0918.Exec;

public class HowmanyExec {
	//Maybe 정규표현 공부
	public static void main(String[] args) {

		//String = "ab!cde!12!45!1!";
		//느낌표가 몇개가 있는지 함수 만들어보기
		String a = "ab!cde!12!45!1!";
		int cnt=0;
		for (int i = 0; i<a.length();i++) {
			if(a.charAt(i)=='!') {
				cnt+=1;
			}
			
		}System.out.println("!의 갯수는 : "+cnt);
		
			
		}
		
	}


