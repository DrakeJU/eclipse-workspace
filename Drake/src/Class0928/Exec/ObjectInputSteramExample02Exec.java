package Class0928.Exec;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ObjectInputSteramExample02Exec {

	public static void main(String[] args) {
		ObjectInputStream input =null;
		try {
			FileInputStream fileInputStream = new FileInputStream(new File("/Users/drake/Desktop/temp/user"));
			input = new ObjectInputStream(fileInputStream);
			User user2 = null;

			//System.out.println(input.available());

			while(true) {
				user2 = (User)input.readObject();
				System.out.println(user2.getFirstName());
			}
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}catch(EOFException e) {
			System.out.println("전체 출력 완료");
		}catch(IOException e) {
			e.printStackTrace();
		}catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

}
