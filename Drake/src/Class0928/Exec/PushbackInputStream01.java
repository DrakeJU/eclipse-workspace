package Class0928.Exec;

import java.io.FileInputStream;
import java.io.PushbackInputStream;

public class PushbackInputStream01 {

	public static void main(String[] args) {
		String srcFile = "/Users/drake/Desktop/temp/pushbacktesting.rtf";
		try {
			PushbackInputStream pis = new PushbackInputStream(new FileInputStream(srcFile));
			byte byteData;
			while((byteData =(byte)pis.read())!=-1) {
				System.out.print((char)byteData);
				pis.unread(byteData);
				
				byteData = (byte)pis.read();
				System.out.println("	"+(char)byteData);
			}
		}catch (Exception e2) {
			e2.printStackTrace();
		}
	}

}
