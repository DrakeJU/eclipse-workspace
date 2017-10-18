package Class0915.Exec;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashSet<String> set = new HashSet<>();
		set.add("VB");
		set.add("JAVA");
		set.add("VB");
		set.add("C");
		set.add("1");
		
		System.out.println("set의 데이터 개수 : "+set.size());
		set.remove("C");
		System.out.println("set의 데이터 개수 : "+set.size());
		
		Iterator<String> iterator = set.iterator();
		
		while(iterator.hasNext()) {
			String element = iterator.next();
			System.out.println("\t"+element);
			
		}
	}

}
