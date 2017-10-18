package Test.vehicle;

public class Bike {
	
	String 	name;
	float 	velocity;
	float 	distance;
	public Bike() {
		this("no name");
	}
	public Bike(String name) {
		this(name, 0.0f);
	}
	public Bike(String name, float velocity) {
		this.name = name;
		this.velocity = velocity;
		this.distance = 0.0f;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return this.name;
	}
	public void setVelocity(float velocity) {
		this.velocity = velocity;
	}
	public float getVelocity() {
		return this.velocity;
	}
	private void setDistance(float distance) {
		this.distance = distance;
	}
	public float getDistance(long sec) {
		this.distance = velocity * sec;
		return this.distance;
	}
}//Bike
