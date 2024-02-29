package training;

public class MakeACall {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name = "Gowri";
		long j = 8892385033L;
		
		Mobile_Feature mobile = new Mobile_Feature();
		long number = mobile.MakeACall(9);
		String person = mobile.MakeACall(name);
		boolean network = mobile.MakeACallAirtel();
		mobile.name();
		System.out.println(person);
		System.out.println(number);
		System.out.println(j);
		System.out.println(network);
		System.out.println(name);
		
	}

}
