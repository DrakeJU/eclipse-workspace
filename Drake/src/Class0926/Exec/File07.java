package Class0926.Exec;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;

public class File07 {

	public static void main(String[] args) throws IOException {

		File f1 = new File("C:\\Temp\\test.txt");
		File f2 = new File("C:\\Temp\\t12313.txt"); 
		//없는 txt파일을 하게되면 객채만 만들어지고 그것을 가리키기만 할뿐 실제 파일은 만들어 지지 않는다.

		System.out.println("Before Format : "+f1.lastModified());
		SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
		System.out.println("After Format : "+sdf.format(f1.lastModified()));
		
		String strParentDirectory = f1.getParent();
		System.out.println("Parent directory is : "+strParentDirectory);
	}

}
