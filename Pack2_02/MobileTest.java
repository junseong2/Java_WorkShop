package Pack2_02;

public class MobileTest {

	public static void main(String[] args) {

		Ltab ap = new Ltab("Ltap",500,"AP-01");
		Otab and = new Otab("Otap",1000,"AND-20");
		
		
		System.out.println("Mobile \t Battery \t OS");
		System.out.println("-----------------------------------");
		System.out.println(ap);
		System.out.println(and);
		
		ap.charge(10);
		and.charge(10);
		System.out.println("10분 충전");
		System.out.println("Mobile \t Battery \t OS");
		System.out.println("-----------------------------------");
		System.out.println(ap);
		System.out.println(and);
		
		ap.operate(5);
		and.operate(5);
		System.out.println("5분 통화");
		System.out.println("Mobile \t Battery \t OS");
		System.out.println("-----------------------------------");
		System.out.println(ap);
		System.out.println(and);
		
	}

}
