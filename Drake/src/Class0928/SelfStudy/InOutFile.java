package Class0928.SelfStudy;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class InOutFile {

	public static void main(String[] args) {
		
//		if (args.length != 1) {
//			System.out.println("올바른 파일 이름을 입력하시오.");
//			System.exit(1);
//		}
		try{
			BufferedReader br = new BufferedReader(new FileReader("/Users/drake/Desktop/temp/test3"));
			
			String str;
			while((str=br.readLine()) != null) {
				System.out.println(str);
				
			}
			br.close();
		}catch(IOException e) {
			System.out.println("입출력시 오류가 발생했습니다." + e);
		} 
		
	}

}
