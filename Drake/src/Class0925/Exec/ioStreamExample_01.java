package Class0925.Exec;

import java.io.IOException;
import java.io.InputStream;


public class ioStreamExample_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int idata = -1;
		InputStream is = (System.in);// x1
		//스트림을 열었을 경우 꼭 닫아야함. 그렇지 않으면 열린 상태로 있기때문에 나중에 오류 발생할수있을듯.
		
		System.out.println("키보드에서 문자 입력 [마지막에 엔터 치세요!]");
		System.out.println("=================================");
		
		try {//x2
			while(true) {
				idata = is.read();//x3
				if(idata == -1 || (char)idata == 'x') {break;} //x4
				
				System.out.println((char)idata);//x5
				System.out.println(":"+idata);//x6
				//엔터만 쳤을 경우에 10 이 나오는 이유는 엔터값의 아스키코드가 10 이라서 그러함
				
			}
			
		} catch (IOException e) {
			System.out.println(e.toString());
			e.printStackTrace();
		}finally {
			try {
				is.close();
			}catch(Exception e2) {
				
			}
		}
	}

}
