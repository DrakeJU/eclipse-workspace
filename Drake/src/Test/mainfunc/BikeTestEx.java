package Test.mainfunc;

import Test.vehicle.Bike;

public class BikeTestEx {
		
	public static void main(String[] args) {
		
		Bike bikeA = new Bike("자전거 A", 2.0f);
		Bike bikeB = new Bike("자전거 B", 3.0f);
		
//		bikeA.setName("자전거 A");
//		bikeA.setVelocity(2.0f);
//		bikeB.setName("자전거 B");
//		bikeB.setVelocity(3.0f);
		
		long startSec = 0;
				
		while(bikeA.getDistance(startSec+10) >= bikeB.getDistance(startSec)) {
			startSec++;
			System.out.println("\n" + startSec + " sec");
			System.out.println(bikeA.getName() +" : " + bikeA.getDistance(startSec+10)+"Km");
			System.out.println(bikeB.getName() +" : " + bikeB.getDistance(startSec)+"Km");
		}
	}
}
