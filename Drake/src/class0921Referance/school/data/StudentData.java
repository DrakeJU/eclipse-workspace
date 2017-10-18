package class0921Referance.school.data;

public class StudentData {

	private String name;
	private float kor;
	private float eng;
	private float mat;
	private float gym;
	private float tot;
	private float avg;
	
	public StudentData() {
		setName("");
		setKor(0.0f);
		setEng(0.0f);
		setMat(0.0f);
		setGym(0.0f);
		setTot(0.0f);
		setAvg(0.0f);
	}
	public StudentData(String name, float kor, float eng, float mat, float gym) {
		setName(name);
		setKor(kor);
		setEng(eng);
		setMat(mat);
		setGym(gym);
		setTot(kor + eng + mat + gym);
		setAvg((kor + eng + mat + gym)/4);
	}
	public StudentData(String name, String kor, String eng, String mat, String gym) {
		setName(name);
		setKor(Float.valueOf(kor));
		setEng(Float.valueOf(eng));
		setMat(Float.valueOf(mat));
		setGym(Float.valueOf(gym));
		setTot(getKor() + getEng() + getMat() + getGym());
		setAvg((getKor() + getEng() + getMat() + getGym())/4);
	}
	
	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getKor() {
		return this.kor;
	}
	public void setKor(float kor) {
		this.kor = kor;
	}
	public float getEng() {
		return this.eng;
	}
	public void setEng(float eng) {
		this.eng = eng;
	}
	public float getMat() {
		return this.mat;
	}
	public void setMat(float mat) {
		this.mat = mat;
	}
	public float getGym() {
		return this.gym;
	}
	public void setGym(float gym) {
		this.gym = gym;
	}
	public float getTot() {
		return this.tot;
	}
	public void setTot(float tot) {
		this.tot = tot;
	}
	public float getAvg() {
		return this.avg;
	}
	public void setAvg(float avg) {
		this.avg = avg;
	}	
}//StudentData
