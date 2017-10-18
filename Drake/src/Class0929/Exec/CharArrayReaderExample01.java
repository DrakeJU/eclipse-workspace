package Class0929.Exec;

import java.io.CharArrayWriter;
import java.io.File;
import java.io.FileWriter;

public class CharArrayReaderExample01 {

	public static void main(String[] args) throws Exception {

		char c[] = {'H','e','l','l','o','와','W','o','r','l','d','네'};
		CharArrayWriter out = new CharArrayWriter();
		out.write(c);
		
		FileWriter f1 = new FileWriter(new File("/Users/drake/Desktop/temp/CharArrayReaderExample01"));
		out.writeTo(f1);
		
		FileWriter f2 = new FileWriter(new File("/Users/drake/Desktop/temp/CharArrayReaderExample02"));
		out.writeTo(f2);
		
		f1.close();
		f2.close();
		out.close();
		
		FileWriter f3 = new FileWriter(new File("/Users/drake/Desktop/temp/CharArrayReaderExample03"));
		out.writeTo(f3);
		System.out.println("Done");
	}

}
