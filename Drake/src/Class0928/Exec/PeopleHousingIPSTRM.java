package Class0928.Exec;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import Class0928.Data.PeopleHousingData;

public class PeopleHousingIPSTRM {
	//DataInputStream을 이용하여 이름,나이,주택 자가여부 true/false 로 총 3개의 데이타를 입력하여
	//Data객체에 저장후 List add 해서 출력하기
	
	DataInputStream HousingDataInput;
	public PeopleHousingIPSTRM(String inputFile) throws IOException{
		HousingDataInput = new DataInputStream(new FileInputStream(inputFile));
	}
	public List<PeopleHousingData> readAll() throws IOException{
		List<PeopleHousingData> listPeople = new ArrayList<PeopleHousingData>();
		try {
			while(true) {
				String name = HousingDataInput.readUTF();
				int age = HousingDataInput.readInt();
				boolean haveornot = HousingDataInput.readBoolean();
				
				listPeople.add(new PeopleHousingData(name,age,haveornot));
			}
		}catch(Exception e) {
			System.out.println("파일 다 읽었음");
			
		}
		HousingDataInput.close();
		return listPeople;
	}
	
	
	public static void main(String[] args) {

		String inputFile ="/Users/drake/Desktop/temp/PeopleHousingData.rtf";
		try {
			PeopleHousingIPSTRM reader = new PeopleHousingIPSTRM(inputFile);
			List<PeopleHousingData> listPeople = reader.readAll();
			
			for (PeopleHousingData residents : listPeople) {
				System.out.println(residents.getName()+"\t");
				System.out.println(residents.getAge()+"\t");
				System.out.println(residents.isHaveornot()+"\t");
				System.out.println("");

			}
		}catch(Exception e) {
			
		}
	}

}
