package Class0926.Exec;

import java.io.File;

public class File08 {

	public static void main(String[] args) {
		File dir = new File("/Users/drake/Desktop/temp");
		String[]	children = dir.list();
		
		if (children == null) {
			System.out.println("Does not exist or is not a directory.");
		}else {
			for (int i = 0; i<children.length;i++) {
				String filename = children[i];
				System.out.println(filename);
			}
		}
	}

}
