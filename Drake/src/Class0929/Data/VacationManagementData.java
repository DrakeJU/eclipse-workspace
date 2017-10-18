package Class0929.Data;

import java.io.Serializable;
import java.util.Date;


public class VacationManagementData implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 6311970474315373346L;
	String name;
	Date Vacation;
	
	
	public VacationManagementData(String name, Date vacation) {
		super();
		this.name = name;
		Vacation = vacation;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getVacation() {
		return Vacation;
	}
	public void setVacation(Date vacation) {
		Vacation = vacation;
	}
	
}
