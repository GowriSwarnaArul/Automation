package training;

public class LearnConstructor {
	
	int x;
	boolean b;
	String name;
	static float f;
	static long l;
	short s=50;
	
	public static void display() {
		
		System.out.println(l);
		
	}
	
	public int method() {
		
		System.out.println("Method calling");		
		return 1;
	};
	
	void display(boolean b) {
		
		System.out.println("float ==>" +f+ "Long==>"  +l+ "short==>"  +s+ "boolean==>"  +b+ "int==>"  +x+ "string==>"  +name);
	}
	
	void display(int y)
	{
		System.out.println("y");
	}
	
	public LearnConstructor()
	{
		short s= 10;
		this.s = s;
		System.out.println("learncons");
		System.out.println(this.s);
	}
	
	public LearnConstructor(int x)
	{
		System.out.println("intx");
	}
	
	public LearnConstructor(String name)
	{
		System.out.println("Gowri");
	}
	
	public LearnConstructor(float f)
	{
		System.out.println("float");
	}
	
	public LearnConstructor(short s)
	{
		System.out.println("shorts");
	}
	
	public LearnConstructor(boolean z)
	{
		System.out.println("boolean");
	}
	
	public LearnConstructor(long z, boolean b)
	{
		System.out.println("long");
	}
	public static void main(String[] args) {
		
		LearnConstructor lc = new LearnConstructor();
		lc.display(15);
		lc.display(false);
		lc.method();
		LearnConstructor lc1 = new LearnConstructor(10);
		LearnConstructor lc2 = new LearnConstructor("name");
		LearnConstructor lc3 = new LearnConstructor(true);
		LearnConstructor lc4 = new LearnConstructor(10.4f);
		LearnConstructor lc5 = new LearnConstructor(111111111111111l, true);
}
}
