package Class1010.Exec;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderExample01 {

	public static void main(String[] args) {

		String thisLine;
		BufferedReader br = null;

		try {
			br = new BufferedReader(new FileReader("/Users/drake/Desktop/temp/star"));
			while((thisLine = br.readLine()) != null) {
				System.out.println(thisLine);
			}//while
		}catch(IOException e) {
			System.err.println("Error: "+e);
		}finally {
			try {
				br.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}//end main

}
