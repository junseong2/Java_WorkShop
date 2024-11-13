package pack04;

public class TestCompany {

	public static void main(String[] args) {

		double ar = Double.parseDouble(args[0]);
		Company cp = new Company(ar);
		cp.setIncome(ar);
		double total = cp.getAfterTaxBouns() + cp.getAfterTaxIncome();
		
		System.out.println("연 기본급 합:" + cp.getIncome() + " 세후 : "+ cp.getAfterTaxIncome()  );
		System.out.println("연 보너스 합:" + cp.getBouns() + " 세후 : "+ cp.getAfterTaxBouns()  );
		System.out.println("연 지급앱 합:" +total);
	}
	

}
