package Class1010.Exec;

import java.io.CharArrayWriter;
import java.io.IOException;

public class CharArrayReaderExample03 {

	public static void main(String[] args) {

		CharArrayWriter charArrayWriter = new CharArrayWriter();
		
		try {
			charArrayWriter.write("이번은 CharArrayReader Example03 예제입니다.");
			char[] ch = charArrayWriter.toCharArray();
			
			for(char c : ch) {
				System.out.print(c);
			}System.out.println("");
			
			
			for(int i = 0; i<ch.length;i++) {
				System.out.print(ch[i]);
			} System.out.print("이거로도 가능함");
			
		}catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}

}
