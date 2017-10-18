package Class0927.Data;

public class PeopleData {

	private String name;
	private boolean gender; //true 남성, flase 여성
	private int age;
	private float grade;

	public PeopleData() {}
	public PeopleData(String name, boolean gender, int age , float grade) {
		this.name = name;
		this.gender = gender;
		this.age = age;
		this.grade = grade;
	}
	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public boolean getGender() { // public boolean isGender(){ 라고 써야함 is!!!!
		return this.gender;
	}
	public void setGender(boolean gender) {
		this.gender = gender;
	}
	public int getAge() {
		return this.age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public float getGrade() {
		return this.grade;
	}
	public void setGrade(float grade) {
		this.grade = grade;
	}

}
