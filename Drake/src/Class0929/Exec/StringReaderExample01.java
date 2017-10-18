package Class0929.Exec;

import java.io.StringReader;
import java.io.StringWriter;

public class StringReaderExample01 {

	public static void main(String[] args) {

		String str = "Hello!This is StringReader Porgram 테스트 입니다.";
		StringReader sr = new StringReader(str);
		int i = 0;
		int loop = 1;
		System.out.println("sr.markSupported()"+sr.markSupported());
		try {
			while((i = sr.read()) != -1) {
				System.out.print((char)i);
				if(loop == 2) {
					sr.mark(4);
				}else if(loop==5) {
					sr.mark(7);
				}
				loop+=1;
				
			}
			System.out.println("\n========================");
			sr.reset();
			char[]charBuf = new char[10];
			int readLength = 0;
			StringWriter sWriter = new StringWriter();
			while((readLength = sr.read(charBuf)) != -1) {
				sWriter.write(charBuf,0,readLength);
				sWriter.flush();
			}
			System.out.println(sWriter.toString());
		}catch (Exception e) {
			e.printStackTrace();
		}
	}

}
