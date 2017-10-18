package Class0928.Exec;

import java.io.PipedInputStream;
import java.io.PipedOutputStream;

public class PipedInputStreamExample01 {

	public static void main(String[] args) throws Exception {

		PipedOutputStream out = new PipedOutputStream();
		PipedInputStream in = new PipedInputStream();

		in.connect(out);	
		out.write(70);;
		out.write(71);
		out.flush();

		for (int i = 0; i<2;i++) {
			System.out.println(""+(char)in.read());
		}
		byte[]b = new byte[2];
		in.read(b,0,2);

		System.out.print(new String(b));

		in.close();
		out.close();

	}

}
