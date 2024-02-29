package training;

public class Car {
	
	String name= "MyBabe";
	
	public static void main(String[] args) {
		Car carnew = new Car();
		carnew.updateWheel(2);
		carnew.updateWheel("FourWheel");
		
	}

	private void updateWheel(int i)
	{
		System.out.println(i);
	}
	
	private void updateWheel(String wheel)
	{
		System.out.println(wheel);
	}
	
	public void myCarColour() 
	{
		System.out.println("Bronze");
	}
		
	public int numOfWheel() 
	{
			return 4;
	}
	
	public String carName()
	{
		System.out.println(name);
		return "Babe";
	}
	
	public boolean isPetrol() 
	{
		return true;
	}
		
	}

