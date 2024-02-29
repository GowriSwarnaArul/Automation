package training;

public class ArrayClass {
	
	String a = "10";
	String b = "100";
	
	
	void stringToInteger()
	{
		int c = Integer.parseInt(a);
		int d = Integer.parseInt(b);
		float f = Float.parseFloat(a);
		System.out.println("a==>"+c+"\n" +"b==>"+d);
		System.out.println(f);
	}
	
	public static void main(String[] args) {
		
		ArrayClass ac = new ArrayClass();
		ac.stringToInteger();
		
	}	

}
