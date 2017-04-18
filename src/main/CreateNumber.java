package main;

import java.util.Random;

public class CreateNumber {
	
	public int createNumber(int max, int min){
	
		Random rand = new Random();
		int point = rand.nextInt(max) + min;

		return point;
	}
}
