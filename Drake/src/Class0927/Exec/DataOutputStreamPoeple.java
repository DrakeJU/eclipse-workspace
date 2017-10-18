package Class0927.Exec;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import Class0927.Data.PeopleData;

public class DataOutputStreamPoeple {

	DataOutputStream dataOutput;

	public DataOutputStreamPoeple(String outputFile) throws IOException{
		dataOutput = new DataOutputStream(new FileOutputStream(outputFile));
	}
	public void write (PeopleData student) throws IOException{
		dataOutput.writeUTF(student.getName());
		dataOutput.writeBoolean(student.getGender());
		dataOutput.writeInt(student.getAge());
		dataOutput.writeFloat(student.getGrade());

	}

	public void save() throws IOException{
		dataOutput.close();

	}

	public static void main(String[] args) {
		String outputFile = "/Users/drake/Desktop/temp/DataInputPeopleData.txt";
		List<PeopleData> listPeopleData = new ArrayList <PeopleData>();

		listPeopleData.add(new PeopleData("Alice", false, 23, 80.5f));
		listPeopleData.add(new PeopleData("Brian", true, 22, 95.5f));
		listPeopleData.add(new PeopleData("홍길동", false, 21, 79.8f));

		try {
			DataOutputStreamPoeple writer = new DataOutputStreamPoeple(outputFile);
			for(PeopleData people : listPeopleData) {
				writer.write(people);
			}
			writer.save();
		}catch(IOException ex) {
			ex.printStackTrace();
		}
	}

}
