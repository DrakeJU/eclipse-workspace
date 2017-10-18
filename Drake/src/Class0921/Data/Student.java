package Class0921.Data;


import java.util.HashMap;
import java.util.Iterator;

public class Student {

	private String name;
	private HashMap<String, Integer> scoremap;
	

	public  Student(String name, HashMap<String, Integer> scoremap) {
		this.name = name;
		this.scoremap = scoremap;
	}
	
	public String getName() {
		return this.name;
	}
	
	public HashMap<String, Integer> getScoremap() {
		return this.scoremap;
	}
	public double getAvg() {
		Iterator it = this.scoremap.keySet().iterator();
		Double sum = 0.0;
		while(it.hasNext()) {
			String key = (String)it.next();
			Integer score = this.scoremap.get(key);
			sum += score;
		}
		return (Double) sum / this.scoremap.size();
	}
	
	
}

