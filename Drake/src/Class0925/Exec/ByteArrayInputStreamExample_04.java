package Class0925.Exec;

import java.io.ByteArrayInputStream;

public class ByteArrayInputStreamExample_04 {

	public static void main(String[] args) throws Exception {
		byte[] buf = {65,66,67,68,69};
		ByteArrayInputStream bais = null;

		try {
			new ByteArrayInputStream(buf);

			System.out.println("Byte read "+ bais.read());
			System.out.println("Byte read "+ bais.read());
			System.out.println("Byte read "+ bais.read());
			System.out.println("Byte read "+ bais.read());
			System.out.println("Byte read "+ bais.read());

			System.out.println("Reset() invovation");

			//reset()실
			bais.reset();
			System.out.println("Byte read "+ bais.read());
			System.out.println("Byte read "+ bais.read());
		}catch (Exception e) {
			//if I/O error occurs
			e.printStackTrace();
		}finally {
			if (bais != null) {
				bais.close();
			}
		}

	}


}