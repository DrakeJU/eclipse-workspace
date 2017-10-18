package functiononly;

public class gugudanfunction_0911 {

	private int result = 0;
	private int result2 = 0;
	private String resutlall = "";
	private String all;
	
	int i = 1;
	int a = 0;


	public void setGugudanfunction_0911(int a) {

		this.result = a*i;
		for ( i = 1; i<10 ; i++) {
			result = a*i;
			System.out.println(a+" x "+i+" = "+result);
		}
	}
	public void setGugudanfunction_0911(int a,int b) {

		this.result = a*i;
		for ( i = 1; i<10 ; i++) {
			result = a*i;
			result2 = b*i;
			System.out.println(a+" x "+i+" = "+result+"\t" +b+" x "+i+" = "+result2);
			

		}
	}

		public int getGugudanfunction_0911() {
			return result;
		}


	}
