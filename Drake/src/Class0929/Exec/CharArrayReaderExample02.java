package Class0929.Exec;

import java.io.CharArrayWriter;
import java.io.FileWriter;

public class CharArrayReaderExample02 {

	public static void main(String[] args) throws Exception {
		CharArrayWriter caw = new CharArrayWriter();
		String s = "이것은 char 배열 입니다.";
		
		char buf[] = new char[s.length()];
		s.getChars(0, s.length(), buf, 0);// 0번째부터 length까지 buf에 0번째부터 저장한다.
		caw.write(buf);
		
		System.out.println(caw.toString());
		
		char [] c = caw.toCharArray();
		for (int i = 0; i<c.length;i++) {
			System.out.print(c[i]);
		}
		System.out.println("\\n FileWriter()를 이용한 파일저장");
		
		FileWriter f2 = new FileWriter("/Users/drake/Desktop/temp/CharArrayReaderExample02_1");
		caw.writeTo(f2);
		f2.close();
		
		System.out.println("reset 전 : "+caw.toString()+"\t 사이즈 : "+caw.size());
		caw.reset();
		
		
		for(int i = 0 ; i<3;i++) {
			caw.write('X');
		}
		System.out.println("reset 후 : "+caw.toString()+"\t 사이즈 : "+caw.size());
		
	}

}
