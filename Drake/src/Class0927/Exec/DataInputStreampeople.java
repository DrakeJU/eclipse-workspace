package Class0927.Exec;

import java.io.DataInputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import Class0927.Data.PeopleData;

public class DataInputStreampeople {

	DataInputStream dataInput;

	public DataInputStreampeople(String inputFile) throws IOException{
		dataInput = new DataInputStream (new FileInputStream(inputFile));
	}
	public List <PeopleData> readAll() throws IOException{
		List<PeopleData> listStudent = new ArrayList<PeopleData>();

		try {
			while(true) {
				String name = dataInput.readUTF();
				boolean gender = dataInput.readBoolean();
				int age = dataInput.readInt();
				float grade = dataInput.readFloat();
				//PeopleData student = new PeopleData(name, gender, age, grade);
				//liststudent.add(student);
				
				listStudent.add(new PeopleData(name, gender, age, grade));
			}
		}catch(EOFException ex) {
			//reach end of file
			System.out.println("파일 전부다 읽었음");
		}
		
		dataInput.close();
		return listStudent;
	}


	public static void main(String[] args) {
		
		String inputFile = "/Users/drake/Desktop/temp/DataInputPeopleData.rtf";
		try {
			DataInputStreampeople reader = new DataInputStreampeople(inputFile);
			List<PeopleData> listStudent = reader.readAll();
			
			//for (int i = 0; i <listStudent.size();i++){
			//	((PeopleData)listStudent.get(i)).getName();
			//}
			
			for(PeopleData student : listStudent) {
				System.out.print(student.getName()+"\t");
				System.out.print(student.getGender()+"\t");
				System.out.print(student.getAge()+"\t");
				System.out.print(student.getGrade()+"\t");
				System.out.println("");
			}
		}catch(IOException ex) {
			ex.printStackTrace();
		}

	}

}
