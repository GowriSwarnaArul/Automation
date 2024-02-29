package training;

public class ThisAndInstanceKeyword {
	
	int c;
	int a;
	
	int num()
	{
		return 19;
	}
	
	void divideTwoNumbers(int a , int b)
	{
		int c = 30;
		System.out.println(a/b+c);
		System.out.println(this.c);
		System.out.println(this.num());
	}
	
	void addNumbers(int a, int b, int c)
	{
		System.out.println(a+b+c);
	}

	void concatinate(String name , String initial)
	{
		System.out.println(name+" " +initial);
		System.out.println(this.a);
	}
	public static void main(String[] args) {
		ThisAndInstanceKeyword inst = new ThisAndInstanceKeyword();
		inst.divideTwoNumbers(60, 20);
		inst.addNumbers(10, 200, 200);
		inst.concatinate("Gowri", "M");
	}
	
}
