package Class1010.Exec;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterExample01 {

	public static void main(String[] args) {
		FileWriter fw = null;
		try {
			fw = new FileWriter("/Users/drake/Desktop/temp/filewriter01");
			fw.write("FileWriter 예제입니다.");
		}catch (Exception e){
			System.out.println(e);
		}finally {
			try {
				fw.close();
			}catch(IOException e) {
				e.printStackTrace();
			}
		}
		System.out.println("FileWriter 를 이용한 쓰기 성공");
	}

}