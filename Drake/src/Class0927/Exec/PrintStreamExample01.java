package Class0927.Exec;

import java.io.File;
import java.io.IOException;
import java.io.PrintStream;

public class PrintStreamExample01 {

	public static void main(String[] args) {

			
		PrintStream psConsole = new PrintStream(System.out);
		try {
			psConsole.write("Data가 PrintStream을 사용해서 쓰여지고 있습니다.".getBytes());
		}catch (IOException e ) {
			e.printStackTrace();
		}
		psConsole.flush();
		psConsole.close();
		
		PrintStream pwFile = null;
		try {
			pwFile = new PrintStream(new File("/Users/drake/Desktop/temp/text.txt"));
			pwFile.write("Data가 PrintStream".getBytes());
			pwFile.flush();
		}catch(IOException e) {
			e.printStackTrace();
		}finally {
			pwFile.close();
		}
	}

}
