package Class0927.Exec;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataInputOutputStream01 {

	public static void main(String[] args) {
		try {
			DataOutputStream dos = new DataOutputStream(new FileOutputStream("c:\\Temp\\datastream.txt"));
			dos.writeChar('c');
			dos.writeInt(897);
			dos.writeDouble(234.6);
			dos.writeByte(34);
			dos.writeBoolean(true);
			dos.writeUTF("안녕하세요");
			dos.writeUTF("환영합니다.");
			dos.flush();
			dos.close();

			System.out.println("데이타 파일 입출력 : dsfile ");
			System.out.println("=========================");
			DataInputStream dis = new DataInputStream(new FileInputStream("c:\\\\Temp\\\\datastream.txt"));
			System.out.println(dis.readChar());
			System.out.println(dis.readInt());
			System.out.println(dis.readDouble());
			System.out.println(dis.readByte());
			System.out.println(dis.readBoolean());
			dis.close();

		}catch (IOException e ) {
			System.out.println(e.toString());
		}
	}

}
