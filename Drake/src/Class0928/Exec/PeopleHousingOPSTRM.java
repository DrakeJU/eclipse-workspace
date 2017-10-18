package Class0928.Exec;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import Class0928.Data.PeopleHousingData;

public class PeopleHousingOPSTRM {
	
	DataOutputStream HousingDataOutput;
	
	public PeopleHousingOPSTRM(String outputFile) throws IOException{
		HousingDataOutput = new DataOutputStream(new FileOutputStream(outputFile));
	}
	public void write (PeopleHousingData poeple) throws IOException{
		HousingDataOutput.writeUTF(poeple.getName());
		HousingDataOutput.writeInt(poeple.getAge());
		HousingDataOutput.writeBoolean(poeple.isHaveornot());
	}
	public void save()throws IOException{
		HousingDataOutput.close();
	}
	public static void main(String[] args) {
		String outputFile ="/Users/drake/Desktop/temp/PeopleHousingData.rtf";
		List<PeopleHousingData> listHousingData = new ArrayList<PeopleHousingData>();
		
		listHousingData.add((new PeopleHousingData("김말똥",20,false)));
		listHousingData.add((new PeopleHousingData("콜린퍼스",50,true)));
		listHousingData.add((new PeopleHousingData("에슐리",40,false)));
		
		try {
			PeopleHousingOPSTRM writer = new PeopleHousingOPSTRM(outputFile);
			for (PeopleHousingData poeple : listHousingData) {
				writer.write(poeple);
			}
			writer.save();
		}catch(IOException ex) {
			ex.printStackTrace();
		}
		
		
	}

}
