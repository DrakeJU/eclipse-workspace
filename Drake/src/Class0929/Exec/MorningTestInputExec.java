package Class0929.Exec;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

import Class0929.Data.MorningTestData;

public class MorningTestInputExec {

	public static void main(String[] args) {
		ObjectInputStream input = null;
		try {
			FileInputStream fileinputStream = new FileInputStream(new File("/Users/drake/Desktop/temp/morningTest"));
			input = new ObjectInputStream(fileinputStream);
			MorningTestData aa = null;
			
			while(true) {
				aa = (MorningTestData)input.readObject();
				System.out.println(aa.getName());
				System.out.print(aa.getAge()+"세"+" ");
				System.out.print((aa.getBirthday())+" ");
				System.out.print(aa.isGender()+" ");
				System.out.print(aa.getGrade()+" ");
				System.out.println("\n");
			}
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}catch(EOFException e) {
			System.out.println("출력 끝");
		}catch(IOException e) {
			e.printStackTrace();
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

}
