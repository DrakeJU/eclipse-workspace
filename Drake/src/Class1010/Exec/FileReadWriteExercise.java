package Class1010.Exec;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReadWriteExercise {

	public static void main(String[] args)   {

		FileReader fr = null;
		FileWriter fw = null;
		int length;
		try {
			fr = new FileReader("/Users/drake/Desktop/temp/star");
			fw = new FileWriter("/Users/drake/Desktop/temp/star_filewriter");
			char[] cbuf = new char[256];
			while((length = fr.read(cbuf)) != -1) {
				fw.write(cbuf,0,length);
				fw.flush();
			}
			System.out.println("FileWriter 를 이용한 쓰기 성공");
		}catch(Exception e) {
			System.out.println(e);
		}finally {
			try {
				fr.close();
				fw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
