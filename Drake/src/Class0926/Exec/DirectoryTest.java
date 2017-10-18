package Class0926.Exec;

import java.io.File;
import java.io.IOException;

public class DirectoryTest {

	public static void main(String[] args) throws IOException {
		showInnerDir(1,new File("/Users/drake/Desktop/temp"));
	}
	static void showInnerDir(int indent, File file) throws IOException{
		for(int i = 0; i <indent; i++) {
			System.out.print('-');
		}
		System.out.println(file.getName());
		if(file.isDirectory()) {
			File[] files = file.listFiles();

			for(int i = 0; i<files.length;i++) {
				showInnerDir(indent+4, files[i]);

			}
		} file.delete();
	}
}




