package Class0928.Exec;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ObjectInputStreamExample01 {

	public static void main(String[] args) {
		String s = "Hello world!";
		int i = 9876523;
		
		try {
			//1번 옵션 으로 해도 되고
			FileOutputStream out = new FileOutputStream("/Users/drake/Desktop/temp/ObjectInputStreamExample01.txt");
			ObjectOutputStream oout = new ObjectOutputStream(out);
			oout.writeObject(s);
			oout.writeObject(i);
			oout.flush();
			oout.close();
			//2번 옵션 으로 해도 됨
			ObjectInputStream ois = new ObjectInputStream(new FileInputStream("/Users/drake/Desktop/temp/ObjectInputStreamExample01.txt"));
			
			System.out.println("" + (String)ois.readObject());
			System.out.println(""+ois.readObject());
			
		}catch(Exception ex) {
			ex.printStackTrace();
		}
	}

}
