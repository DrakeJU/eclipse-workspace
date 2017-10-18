package Class0929.Data;

import java.io.Serializable;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class MorningTestData implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -2505630136899075301L;
	
	private String name;
	private int age;
	private Date birthday;
	private Boolean gender;
	private int grade;
	
	SimpleDateFormat birthdayset = new SimpleDateFormat("yyyyMMdd");
	
	
	public MorningTestData(String name, int age, String birthday, Boolean gender, int grade) {
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.grade = grade;
		try {
			this.birthday = birthdayset.parse(birthday);
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Date getBirthday() {
		return birthday;
	}
	
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	public Boolean isGender() {
		return gender;
	}
	public void setGender(Boolean gender) {
		this.gender = gender;
	}
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}

	
}