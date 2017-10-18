package Class0925.Exec;

import java.io.File;

public class File01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String directories = "/Users/drake/Desktop/temp"; //windows 파일 경로
		File file = new File(directories);

		//		mkdir: 만들고자 하는 디렉토리의 상위 디렉토리가 존재하지 않을 경우, 생성불가
		//		mkdirs: 만들고자 하는 디렉토리의 상위 드렉토리가 존재하지 않을 경우, 생성가능

		boolean result = file.mkdirs(); //만들기
		//boolean result = file.delete();//삭제하기

		System.out.println("Status = "+result);


	}

}
