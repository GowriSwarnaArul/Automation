package practise;

public class Day1 {

	public static void main(String[] args) {
		int i = 4;
		int j = 5;
		int k = i*j;
		Day1 dayOne = new Day1();
		dayOne.MyTvName();
		String feature = dayOne.MyTvFeature();
		dayOne.MyTvSmart();
		System.out.println(feature);
		System.out.println(k);
		System.out.println(dayOne.MyTvCost());
	}
	
	public void MyTvName()
	{
		System.out.println("Oneplus");
	}

	public String MyTvFeature()
	{
		return "LED_TV";
	}
	
	private int MyTvCost()
	{
		return 15;
	}
	
	public boolean MyTvSmart()
	{
		return true;
	}
	
}
