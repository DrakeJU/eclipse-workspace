package Class0928.Data;

public class PeopleHousingData {
	
	String name;
	int age;
	boolean haveornot;
	
	public PeopleHousingData() {
	}
	public PeopleHousingData(String name, int age, boolean haveornot) {
		this.name = name;
		this.age = age;
		this.haveornot = haveornot;
	}
	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return this.age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public boolean isHaveornot() {
		return this.haveornot;
	}
	public void setHaveornot(boolean haveornot) {
		this.haveornot = haveornot;
	}
}
