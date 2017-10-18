package Class0921.Exec;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

//주사위를 3000번 돌려서 주사위 번호 별로 확율
//주사위번호별 확율이 15%이하이면 에러 발생 (throw)

public class DiceExec {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Random randomdice = new Random();
		ArrayList DiceList = new ArrayList();

		for(int i = 0; i<3000;i++) {
			DiceList.add(randomdice.nextInt(6)+1);
		}//다이스 케스트를 어레이리스트에 추가
		System.out.println("Dice Array List Size : "+DiceList.size());//어레이 리스트 사이즈 확인

		HashMap<Integer, Integer> Dicehm = new HashMap<Integer,Integer>();// 초기화
		Dicehm.put(1,0);
		Dicehm.put(2,0);
		Dicehm.put(3,0);
		Dicehm.put(4,0);
		Dicehm.put(5,0);
		Dicehm.put(6,0);
		
		System.out.println("");//초기화 된값 출력
		System.out.println("초기화된 ----1의 갯수"+Dicehm.get(1));//초기화 된값 출
		System.out.println("Dicehm size : "+Dicehm.size());

		int cnt1=0;
		int cnt2=0;
		int cnt3=0;
		int cnt4=0;
		int cnt5=0;
		int cnt6=0;

		for(int i = 0; i<DiceList.size();i++) {
			int temp = (int) DiceList.get(i);
			//System.out.print(temp);
//			int value = Dicehm.get(temp);
//			value++;
//			Dicehm.put(temp, value);
			
			if(temp == 1) {
				Dicehm.put(1, cnt1+=1);
			}else if (temp == 2) {
				Dicehm.put(2, cnt2+=1);
			}else if (temp == 3) {
				Dicehm.put(3, cnt3+=1);
			}else if (temp == 4) {
				Dicehm.put(4, cnt4+=1);
			}else if (temp == 5) {
				Dicehm.put(5, cnt5+=1);
			}else if (temp == 6) {
				Dicehm.put(6, cnt6+=1);
			}
			
			
			
		}
		System.out.println("----1의 갯수"+Dicehm.get(1));//초기화 된값 출
		System.out.println("----2의 갯수"+Dicehm.get(2));//초기화 된값 출
		System.out.println("----3의 갯수"+Dicehm.get(3));//초기화 된값 출
		System.out.println("----4의 갯수"+Dicehm.get(4));//초기화 된값 출
		System.out.println("----5의 갯수"+Dicehm.get(5));//초기화 된값 출
		System.out.println("----6의 갯수"+Dicehm.get(6));//초기화 된값 출
		
		
		
	}
}

