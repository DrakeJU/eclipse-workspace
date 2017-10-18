package Class0925.Exec;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;

public class BufferedInputStreamExample_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int idata = -1;
		InputStream is = (System.in);//x1
		System.out.println("키보드에 문자 입력 [마지막에 엔터]");
		System.out.println("==========================");
		try {//x2
			BufferedInputStream bis = new BufferedInputStream(is);
			
			while(true) {
				idata = bis.read(); //x3
				if(idata == -1||(char)idata == 'x') {break;}
				System.out.println((char)idata);//x4
				System.out.println(":"+idata);//x5
					
			}
		} catch(IOException e ) {
			System.out.println(e.toString());
		}
	}

}
