package pack03;

public class TestAccount {

	public static void main(String[] args) {
		
		Account a1 = new Account("441-0290-1203", 500000,7.3);
		System.out.println("계좌정보 : " + a1.getAccount() + " 현재 잔액 : "+ a1.getBalance());
		
		a1.withdraw(600000);
		a1.deposit(20000);
		
		System.out.println("계좌정보 : " + a1.getAccount() + " 현재 잔액 : "+ a1.getBalance());
		System.out.println(a1.calculateInterest());
		
	}

}
