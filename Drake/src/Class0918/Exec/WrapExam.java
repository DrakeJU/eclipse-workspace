package Class0918.Exec;

public class WrapExam {

	public static void main(String[] args) {

		int i = 10;
		Integer intg = new Integer(i);
		System.out.println("print out [intg]"+intg);
		String no = "223";
		Integer num = new Integer(no);
		System.out.println("print out [num]"+num);
		
		int x = Integer.valueOf("200");
		System.out.println("문자열 200 을 객체형 int x에 집어넣어서 변환한 x의 값 : "+x);
		int xx = Integer.valueOf("300");
		System.out.println("문자열 300 을 객체형 int x에 집어넣어서 변환한 x의 값 : "+xx);
		
		Integer itr = new Integer(10);
		System.out.println("byte value: "+itr.byteValue());
		System.out.println("double value: "+itr.doubleValue());
		System.out.println("float value: "+itr.floatValue());
		System.out.println("int value: "+itr.intValue());
		//System.out.println("int value: "+itr.intValue(itr));
		System.out.println("long value: "+itr.longValue());
		System.out.println("short value: "+itr.shortValue());

		
	}

}
