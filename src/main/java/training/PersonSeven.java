package training;

public class PersonSeven {

	void eat()
	{
		System.out.println("Non static ");
	}
	
	static void sleep()
	{
		System.out.println("Static");
	}
	
	public static void main(String[] args) {
		sleep();
		PersonSeven ps = new PersonSeven();
		ps.eat();
	}
}
