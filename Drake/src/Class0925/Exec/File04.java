package Class0925.Exec;

import java.io.File;

public class File04 {

	public static void main(String[] args)  {
		//c:\\temp\\
		//c:/temp
		File file = new File("C:"+File.separator+"Temp"+File.separator+"test.txt");
		System.out.println("C:"+File.separator+"Temp"+File.separator+"test.txt");
		System.out.println(file.isHidden());
	}

}
