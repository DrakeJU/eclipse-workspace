package com.service;

public class FirstSampleSvc {
	
	public int sum(int inputNum) {
		int sum = 0;
		for(int i = 0 ; i <= inputNum ; i++) {
			sum += i;
		}
		return sum;
	}
	
}
