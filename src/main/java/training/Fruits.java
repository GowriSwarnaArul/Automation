package training;

import java.util.Arrays;

public class Fruits {
	
	public Fruits() {
		String[] fts = {"Apple", "Orange", "Kiwi", "Strawberry", "Berry"};
		System.out.println("Arrays all values ==>"+Arrays.toString(fts));
		System.out.println("Last array data ==> "+fts[fts.length-1]);
		String fs = Integer.toString(fts.length - 1);
		System.out.println("Total number of values ==>"+fs);
	}
	
	public static void main(String[] args) {
		Fruits fts = new Fruits();

	}
}
