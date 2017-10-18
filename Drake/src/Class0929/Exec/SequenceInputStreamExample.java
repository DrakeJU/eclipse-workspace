package Class0929.Exec;


import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.SequenceInputStream;
import java.util.Arrays;
import java.util.Vector;

public class SequenceInputStreamExample {

	public static void main(String[] args) {

		byte[]arr1 = {0,1,2};
		byte[]arr2 = {3,4,5};
		byte[]arr3 = {6,7,8};
		byte[]outSrc = null;

		Vector<ByteArrayInputStream> vector = new Vector<ByteArrayInputStream>();
		vector.add(new ByteArrayInputStream(arr1));
		vector.add(new ByteArrayInputStream(arr2));
		vector.add(new ByteArrayInputStream(arr3));

		//각각의 바이트 배열이 담긴 값을 SequenceInputStream 을 통해 하나로 합칩니다.

		SequenceInputStream input = new SequenceInputStream(vector.elements());
		ByteArrayOutputStream output = new ByteArrayOutputStream();

		int data = 0;
		try {
			//합처진 input 을 통해 전체 크기만큼 output에 담습니다.
			while((data = input.read()) != -1) {
				output.write(data);
			}
		}catch(IOException e) {
			e.printStackTrace();
		}
		outSrc = output.toByteArray();
		System.out.println("Input Source1 : "+ Arrays.toString(arr1));
		System.out.println("Input Source2 : "+ Arrays.toString(arr2));
		System.out.println("Input Source3 : "+ Arrays.toString(arr3));
		System.out.println("Input totallity : "+ Arrays.toString(outSrc));

	}

}
