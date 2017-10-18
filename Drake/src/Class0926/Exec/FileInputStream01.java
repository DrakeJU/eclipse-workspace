package Class0926.Exec;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStream01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file = new File("/Users/drake/Desktop/temp");
		FileInputStream fis = null;
		
		
		try {
			fis = new FileInputStream(file);
			System.out.println("읽을수있는 내용 사이즈 (in bytes) : "+fis.available());
			
			int content ;
			while ((content = fis.read())!=-1) {
				//convert to char and display it
				System.out.println((char)content);
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (fis != null) {
					fis.close();
				}
			}catch (IOException ex) {
				ex.printStackTrace();
			}
		}
	}

}
