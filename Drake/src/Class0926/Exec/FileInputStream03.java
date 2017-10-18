package Class0926.Exec;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileInputStream03 {

	public static void main(String[] args) throws IOException {

		File readFile = new File ("/Users/drake/Desktop/temp/read.rtf");
		File writeFile = new File("/Users/drake/Desktop/temp/write.rtf");
		//Read file suing read(byte[] b)
		//버퍼로 감싸는 이유? 버퍼링...
		//일정부분의 데이터를 전해주고 가져오기위해서 File객체를 버퍼드로 감싼다.
		BufferedInputStream bis = new BufferedInputStream(new FileInputStream(readFile));
		BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(writeFile));
		
		byte[] b = new byte [256];
		int n = 0;	//read에서 읽은것을 b로 전
		while((n=bis.read(b)) != -1) {
			bos.write(b,0,n);
		}	//뒤에 인덱스의 값을 write로 전달 -> bos에 전달 하는데 bos가 포함하는게 writeFile임으로 또 전달.
		bis.close();
		bos.close();
		System.out.println("복사완료");
	}

}
