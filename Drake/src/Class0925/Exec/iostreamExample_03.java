package Class0925.Exec;

import java.io.IOException;
import java.io.InputStream;

public class iostreamExample_03 {

	public static void main(String[] args)  {

		int idata = -1;
		InputStream is = (System.in);// x1
		//스트림을 열었을 경우 꼭 닫아야함. 그렇지 않으면 열린 상태로 있기때문에 나중에 오류 발생할수있을듯.

		System.out.println("키보드에서 문자 입력 [마지막에 엔터 치세요!]");
		System.out.println("=================================");

		try {//x2
			byte[] data = new byte[10];
			while(true) {
//				is.skip(1);
				idata = is.read(data,0,1);//x3
				if(idata == -1 || (char)idata == 'x') {break;} //x4

				System.out.println(":"+(char)data[0]+(char)data[2]);//x5

			}

		} catch (IOException e) {
			System.out.println(e.toString());
		} finally {
			try {
				is.close();
			}catch(Exception e2) {

			}
		}
	}

}
