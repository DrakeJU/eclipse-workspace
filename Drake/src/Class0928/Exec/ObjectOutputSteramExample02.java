package Class0928.Exec;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class ObjectOutputSteramExample02 {

	public static void main(String[] args) {

		try {
			FileOutputStream fileOutputStream = new FileOutputStream("/Users/drake/Desktop/temp/user");
			
			User user = new User("gildong","hong","hongmail@gmail.com");
			User user1 = new User("hyun","ryu","ryumail@gmail.com");
			
			ObjectOutputStream output = new ObjectOutputStream(fileOutputStream);
			output.writeObject(user);
			output.writeObject(user1);
			output.flush();
			output.close();
			System.out.println("객체 저장 완료");
		}catch (IOException e) {
			e.printStackTrace();
		}
	}

}
