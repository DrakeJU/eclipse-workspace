package Class1010.Exec;

import java.io.FileReader;
import java.io.OutputStreamWriter;

public class FileReaderExample01 {

	public static void main(String[] args) throws Exception {
		FileReader fr = new FileReader("/Users/drake/Desktop/temp/abc");
		OutputStreamWriter writer = new OutputStreamWriter(System.out);// 파일이 아닌 이클립스 화면에 출력하겠다는 의미
		//OutputStreamWriter writer = new OutputStreamWriter("/Users/drake/Desktop/temp/abc"); 이렇게하면 파일에 출력하겟따는 의미
		
		int length;
		char[] cbuf = new char[256];
		while((length = fr.read(cbuf)) != -1) {
			System.out.println(cbuf);
			writer.write(cbuf,0,length);
			writer.flush();
		}
		fr.close();
		writer.close();
	}

}
