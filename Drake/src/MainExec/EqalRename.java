package MainExec;

public class EqalRename {

	int a  = 1;
	
	public void setA(int a) {
		this.a=a;
	}
	public boolean equals(Object obj) {
		if(this.a == ((EqalRename)obj).a) {
			return true;
		}else {
			return false;
		}
	}
	
}
