package training;

public class LearnStatic {
	
	int x;
	static int y;
	
	static int count()
	{
		System.out.println();
		return 1;
	}
	
	public LearnStatic()
	{
		x++;
		y++;
		System.out.println("print: x==>"+x+ "print: y==>"+y);
		System.out.println(LearnStatic.y);
		
	}
	
	public LearnStatic(int x)
	{
		System.out.println("parameter");
	}
	
	void num()
	{
		System.out.println("Method");
	}
	
	public static void main(String[] args) {
		
		LearnStatic ls = new LearnStatic();
		LearnStatic ls1 = new LearnStatic(1);
		LearnStatic ls2 = new LearnStatic();
		ls2.num();
		LearnStatic.count();
	}

}
