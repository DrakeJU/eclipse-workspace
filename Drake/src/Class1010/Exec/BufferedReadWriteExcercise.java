package Class1010.Exec;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class BufferedReadWriteExcercise {

	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new FileReader("/Users/drake/Desktop/temp/star"));
		BufferedWriter bw = new BufferedWriter(new FileWriter("/Users/drake/Desktop/temp/star_bw"));

		String thisLine;
		while((thisLine = br.readLine()) != null) {
			System.out.println(thisLine); //화면 출력을 위한것.
		}
		br.close();//이미 다 읽고 커서가 끝가지 가서 밑에처럼 다시 열어주지 않는 이상 더이상 읽을게 없음
		br = new BufferedReader(new FileReader("/Users/drake/Desktop/temp/star"));
		
		int length;
		char [] cbuf = new char[256];
		while((length = br.read(cbuf)) >0) {
			bw.write(cbuf,0,length);
			bw.flush();
		}
		bw.close();
		br.close();
	}

}
