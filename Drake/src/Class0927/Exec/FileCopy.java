package Class0927.Exec;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopy {
	//C:\temp\read.txt 를 C:\temp\a\write.txt로 복사하시오.

	public static boolean FileCopy(String source, String target) throws IOException {

		File read = new File(source);
		if(!read.exists()) {
			System.out.println("폴더가 없음");
			return false;
		}
		String targetDirPath = target.substring(0,target.lastIndexOf('/'));
		File targetDir = new File(target);
		if(!targetDir.exists()) {
			targetDir.mkdirs();
		}
		File copyFile = new File(target);
		BufferedInputStream bis = new BufferedInputStream(new FileInputStream(read));
		BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(copyFile));

		byte[] b = new byte [256];
		int n = 0;	//read에서 읽은것을 b로 전
		while((n=bis.read(b)) != -1) {
			bos.write(b,0,n);
		}	//뒤에 인덱스의 값을 write로 전달 -> bos에 전달 하는데 bos가 포함하는게 writeFile임으로 또 전달.
		bis.close();
		bos.close();
		System.out.println("복사완료");

		return true;
	}
	public static void main(String[] args) throws IOException {

		String readPath = "/Users/drake/Desktop/temp/read.rtf";
		String copyPath	="/Users/drake/Desktop/temp/x/o/write.rtf";

		if(FileCopy(readPath, copyPath)) {
			System.out.println("카피됨");
		}else {
			System.out.println("카피실패");
		}

	}

}
