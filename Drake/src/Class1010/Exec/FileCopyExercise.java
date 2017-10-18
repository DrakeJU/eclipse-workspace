package Class1010.Exec;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopyExercise {

	public static void main(String[] args) throws IOException {

		File readFile = new File("/Users/drake/Desktop/temp/abc");
		File writeFile = new File("/Users/drake/Desktop/temp/defg");

		BufferedInputStream bfinput = new BufferedInputStream(new FileInputStream(readFile));
		BufferedOutputStream bfoutput = new BufferedOutputStream(new FileOutputStream(writeFile));

		byte[]b = new byte[256];
		int n = 0;
		while((n=bfinput.read(b))!=-1) {
			bfoutput.write(b,0,n);
		}
		bfinput.close();
		bfoutput.close();


	}

}
