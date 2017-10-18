package Class0925.Exec;

import java.io.ByteArrayInputStream;

public class ByteArrayInputStreamExample_03 {

	public static void main(String[] args) {

		byte[] buf = {1,2,3,4,5,6,7,8,9};
		ByteArrayInputStream b = new ByteArrayInputStream(buf);
		
		byte[] newBuffer = new byte[10];
		int num = b.read(newBuffer,2,4); //newBuffer를 6개짜리를 생성하고
		//그 6개짜리를 채우는데 b에서부터 가져온 것들로 체울예정
		//그것들을 newBuffer에 두번째부터 네번째까지를 buf배열 순서대로 체울예정
		
		System.out.println("Bytes read : "+num);
		
		for(int i = 0; i<newBuffer.length;i++) {
			int nr = (int) newBuffer[i];
			if (newBuffer[i]==0) {
				//byte 형은 주소값을 가지지 않음으로 null 값이 들어갈수없다.
				//String str = null의 경우 String이 객체고 str에 주소값을 넣는게 보통이라면 
				//일반데이타형은 주소값을 가지지 않는다.
				System.out.println(" -null- ");
			}else {
				System.out.println(nr+" ");
			}
		}
	}

}
