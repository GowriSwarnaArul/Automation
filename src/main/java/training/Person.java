package training;

public class Person {
	
	int x;
	static int y;

	{
		System.out.println("just method"); //standalone statement
	}
	
	
	static 
	{
		System.out.println("static method");
	}
	public static void String()
	{
		String name = "google";
		System.out.println(name);
	}
	
	
	void num()
	{
		System.out.println("Non static method");
	}
	
	int count()
	{
		x++;
		y++;
		System.out.println("Non static: "+x+"\n" +"Static:==>"+y);
		return 1;			
	}
	
	
	public static void main(String[] args) {
		Person person = new Person();
		person.count();
		
	}

}
