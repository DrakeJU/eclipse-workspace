package Class0926.Exec;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStream02 {

	public static void main(String[] args) {

		File file = new File("/Users/drake/Desktop/temp/test.rtf");
		FileInputStream fis = null;
		BufferedInputStream bis = null;
		
		try {
			fis = new FileInputStream(file);
			bis = new BufferedInputStream(fis);
			System.out.println("읽을 수 있는 내용 사이즈 (in bytes) : "+ bis.available());
			int content;
			while((content = bis.read()) != -1) {
				//covert to char and display it
				System.out.print((char)content);
			}
		}catch (IOException e) {
			e.printStackTrace();
		}finally {
			
		}
	}

}
