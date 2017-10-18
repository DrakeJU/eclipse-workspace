package Class0915.Exec;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class HashMapExample {

	public static void main(String[] args) {


		HashMap<String, String> ht = new HashMap<String, String>();
			ht.put("Grapes", "포도");
			ht.put("Apple", "사과");
			ht.put("Strawberry", "딸기");
			ht.put("Orange", "오렌지");
			System.out.println("hashtalbe의 키의 수 : "+ht.size());
			System.out.println("hashtable의 키로 값을 찾음 : "+(String)ht.get("Apple"));
			System.out.println();
			Set<String> keyset = ht.keySet();
			Iterator<String> keyiterator = keyset.iterator();
			while(keyiterator.hasNext()) {
				String k = (String)keyiterator.next();
				String v = (String)ht.get(k);
				System.out.println("키 : "+k+"---->값 : "+v);

		}

	}
}
