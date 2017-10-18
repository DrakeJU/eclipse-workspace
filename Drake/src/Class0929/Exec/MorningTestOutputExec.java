package Class0929.Exec;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.text.SimpleDateFormat;

import Class0929.Data.MorningTestData;

public class MorningTestOutputExec {

	public static void main (String[]args) {
		try {
			
			FileOutputStream fileOutputStream = new FileOutputStream("/Users/drake/Desktop/temp/morningTest");
			
			MorningTestData user1 = new MorningTestData("홍길동",20,"20000101",true,100);
			MorningTestData user2 = new MorningTestData("김말숙",22,"20000909", false,99);
			
			ObjectOutputStream output = new ObjectOutputStream(fileOutputStream);
			output.writeObject(user1);
			output.writeObject(user2);
			output.flush();
			output.close();
			System.out.println("객체 저장 완료");
			
		}catch(IOException e) {
			e.printStackTrace();
		}
	}

}
