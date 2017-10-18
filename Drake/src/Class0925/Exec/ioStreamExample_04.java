package Class0925.Exec;

import java.io.InputStream;
import java.io.OutputStream;


public class ioStreamExample_04 {

	public static void main(String[] args) throws Exception {
		
		System.out.println("키보드에서 문자 입력 [마지막에 엔터 치세요!]");
		InputStream is = (System.in);
		System.out.println("입력한 문자 문자 : ");

		int a = is.read();
		
		System.out.println("출력 스트림 : ");
		OutputStream os = (System.out);
		
		os.write(a);
		os.flush();
		
		System.out.println("");
		System.out.println("바이트 배열 출력 스트림 출력");
	
		byte[] osByte = "12345안녕".getBytes();
		os.write(osByte);
		os.flush();
		
		is.close();
		os.close();
		
		
	}

}
