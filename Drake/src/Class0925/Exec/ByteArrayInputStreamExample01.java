package Class0925.Exec;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.Random;

public class ByteArrayInputStreamExample01 {

	public static void main(String[]  args) throws IOException {
		
		byte[] buffer = new byte[10];
		Random rnd = new Random();
		
		for(int i=0; i < buffer.length;i++) {
			buffer[i] = (byte)rnd.nextInt(10);
		}
		ByteArrayInputStream b = new ByteArrayInputStream(buffer);
		System.out.print("버퍼 내용 출력 : ");
		int num;
		while((num=b.read()) != -1) {
			System.out.print(num+ " ");
		}
		b.close();
	}

}
