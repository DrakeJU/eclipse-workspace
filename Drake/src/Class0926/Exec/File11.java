package Class0926.Exec;

import java.io.File;

public class File11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String curDir = System.getProperty("user.dir");
		System.out.println("현재 디렉토리 : "+curDir+": Directory");
		
		File[] roots = File.listRoots(); //루트는 제일 메인이 되는 드라이버 예) c드라이브
		System.out.println("시스템루트 디렉토리");
		
		for (int i = 0; i <roots.length; i++) {
			System.out.println(roots[i].toString());
		}
	}

}
