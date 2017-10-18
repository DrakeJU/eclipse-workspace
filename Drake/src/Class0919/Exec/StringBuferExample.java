package Class0919.Exec;

public class StringBuferExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StringBuffer sbObj1 = new StringBuffer();


		/*
		2. StringBuffer StringBuffer(int length)
		Constructs empty StringBuffer with initial capacity of length
		*/
		StringBuffer sbObj2 = new StringBuffer(10);

		/*
		3. StringBuffer StringBuffer(String str)
		constructs StringBuffer with the contents same as argument String
		*/


		StringBuffer sbObj3 = new StringBuffer("Hello World");
		System.out.println(sbObj3);
		System.out.println("");
		
		sbObj3.append("appen String");
		System.out.println(sbObj3);
		System.out.println("");
		
		
		boolean b = true;
		sbObj3.append(b);
		System.out.println(sbObj3);
		System.out.println("");

		char c = 'Y';
		sbObj3.append(c);
		System.out.println(sbObj3);
		System.out.println("");

		char[] c1 = new char[] {'Y','e','s'};
		sbObj3.append(c1);
		System.out.println(sbObj3);
		System.out.println("");

		double d = 1.0;
		sbObj3.append(d);
		System.out.println(sbObj3);
		System.out.println("");


		float f = 1.0f;
		sbObj3.append(f);
		System.out.println(sbObj3);
		System.out.println("");

		int i = 1;
		sbObj3.append(i);
		System.out.println(sbObj3);
		System.out.println("");

		long l = 1;
		sbObj3.append(l);
		System.out.println(sbObj3);
		System.out.println("================");


		
		
		StringBuffer sb = new StringBuffer("Hello World");
		sb.replace(0,5,"Hi");
		System.out.println(sb);
		
		System.out.println(sb.substring(2));
		
		int len = sb.length();
		System.out.println("문자열길이: " + len);
		
		
		
		StringBuffer sb1 = new StringBuffer("Hello World");
		sb1.delete(0,6); //6미만의 값까지 삭제. 6은 살림
		System.out.println(sb1);



		/*
		 To clear contents of a StringBuffer use delete(int start, int end) method
		 in the below given way 
		*/


		StringBuffer sb2 = new StringBuffer("Some Content");
		System.out.println(sb2);
		sb2.delete(0, sb2.length());// 랭스는 1부터다. not 0부터
		System.out.println(sb2);


		/*
		 StringBuffer deleteCharAt(int index) deletes the character at specified
		 index.
		 This method throws StringIndexOutOfBoundException if index is negative
		 or grater than or equal to the length.
		*/


		StringBuffer sb3 = new StringBuffer("Hello World");
		sb3.deleteCharAt(0);
		System.out.println(sb3);

		
		
		
		
	}

}
