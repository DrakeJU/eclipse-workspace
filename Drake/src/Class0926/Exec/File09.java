package Class0926.Exec;

import java.io.File;

public class File09 {

	public static void main(String[] args) {

		File file = new File("C:\\Temp\\test.txt");
		System.out.println("Size : "+file.length()+" bytes");
		System.out.println("파일 존재 여부 : "+file.exists());
		System.out.println("파일 절대 경로 : "+file.getAbsolutePath());
		System.out.println("파일 경로 : "+file.getPath());
		System.out.println("파일 명 :"+ file.getName());
	}

}
