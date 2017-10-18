package Class0915.Exec;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArryListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> list = new ArrayList<>();
			list.add("Pig");
			list.add("Dog");
			list.add("Cow");
			System.out.println("ArryList 객체수 : "+list.size());
			
			list.add("Snake");
			list.add(2,"Cat");
			
			for(int i = 0; i < list.size(); i++) {
				System.out.print(list.get(i)+"   ");
			}
			System.out.println();
			list.remove(3);
			
			Iterator e = list.iterator();
			while(e.hasNext()) {	//Iterator(반복자) 인터페이스 사용
				System.out.println(e.next()+"    ");
			}
			System.out.println();
			list.remove("Pig");
	}

}
