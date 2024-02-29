package training;

import java.util.Arrays;

public class LearnArray {

	public static void main(String[] args) {
		
		//is a data structure fixed size sequential used for same data type.
		// Used to store multiple values of similar data type in a single variable
		
		String[] car = {"BMW", "Benz", "Skoda"};
		System.out.println(car);
		System.out.println(car.length);
		System.out.println(car.length-1);
		System.out.println(car[2]);
		System.out.println(Arrays.toString(car));
		System.out.println();
		
		int[] a = new int[3];
		int[] b = new int [1];
		a[0] = 1;
		b[0] = 2;
		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.toString(b));
	
	}

}
