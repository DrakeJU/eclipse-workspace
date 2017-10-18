package class0921Referance.dice;

import java.util.Iterator;

import data.dice.DiceData;
import logic.dice.DiceLogic;

public class DiceExec {
	
	public static void main(String[] args) {
		
		DiceData diceData 	= new DiceData();
		
		DiceLogic diceLogic	= new DiceLogic();
		diceData.setDiceList(diceLogic.diceAccum(3000));
		
		try {
			diceData.setDiceProb(diceLogic.diceProb(diceData.getDiceList()));
			System.out.println("HashMap ���� Ȯ�� �ٽ� ������ ");
			Iterator itrKeys = diceData.getDiceProb().keySet().iterator();
			Integer key = 0;
			while(itrKeys.hasNext()) {
				key = (Integer)itrKeys.next();
				System.out.println((key+1) + "�� Ȯ�� -> " + diceData.getDiceProb().get(key));
			}
		}catch(Exception e) {
			System.out.println("" + e);
		}
	}//main
}//DiceExec