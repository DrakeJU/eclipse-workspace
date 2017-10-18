package Class0915.Exec;

import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedListExample {

	public static void main(String[] args) {

		
		LinkedList<String> llist=new LinkedList<>();
		ArrayList<String> alist= new ArrayList<>();
		long sttime;
		long	 endtime;
		long calctime;
		
		llist.add("end");
		alist.add("end");
		
		sttime = System.nanoTime();
		for(int x=0; x<5000l;x++) {
			llist.add(x,String.valueOf(x));
		}
		endtime = System.nanoTime();
		calctime = endtime = sttime;
		System.out.println("LinkedList 객체 삽입 측정 시간 : "+"\t"+calctime+" ns");
		
		sttime = System.nanoTime();
		for(int x=0; x<5000; x++) {
			alist.add(x,String.valueOf(x));
		}
		endtime = System.nanoTime();
		calctime = endtime = sttime;
		System.out.println("ArrayList 객체 삽입 측정 시간 : "+"\t"+calctime+" ns");
		
		
		endtime = System.nanoTime();
		calctime = endtime = sttime;
		System.out.println("LinkedList 객체 삽입 측정 시간 : "+"\t"+calctime+" ns");
		
		sttime = System.nanoTime();
		for(int x=0; x<5000; x++) {
			alist.add(x,String.valueOf(x));
		}
		endtime = System.nanoTime();
		calctime = endtime = sttime;
		System.out.println("ArrayList 객체 삽입 측정 시간 : "+"\t"+calctime+" ns");
		
		
		
	}

}
