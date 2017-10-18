package Class0926.Exec;

import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

public class BuffMorning {

	public static void main(String[] args) throws Exception  {

		String temp = "abcdefg";
		InputStream a;
		byte[] buff =temp.getBytes();
		a = new ByteArrayInputStream(buff);
		BufferedInputStream aa = new BufferedInputStream(a);

//		int num;
//		while((num=aa.read()) !=-1) {
//			System.out.print((char)num + "   ");
//		}//내가 한 방법 아스키 코드로 바꾸고 그걸 다시 문자형으로 변환
		
		while(a.available()>0) {
			System.out.print((char)a.read());
		} // 선생님 방법
	
	}

}

