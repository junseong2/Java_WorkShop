package pack04;

public class Company {
	//변수 선언
	private double salary;
	private double income;
	private double afterTaxIncome;
	private double bouns;
	private double afterTaxBouns;
	
	//생성자
	Company(){}

	public Company(double salary) {
		this.salary = salary;
	}

	//get set 메서드
	public double getSalary() {
		return salary;
	}

	public double getIncome() {
		return income*12;
	}

	public double getAfterTaxIncome() {
	
		return getIncome()*0.9;
	}

	public double getBouns() {
        return income * 0.2 * 4;
	}

	public double getAfterTaxBouns() {
        return getBouns() * 0.945;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public void setIncome(double income) {
		this.income = income;
	}

	public void setAfterTaxIncome(double afterTaxIncome) {
		this.afterTaxIncome = afterTaxIncome;
	}

	public void setBouns(double bouns) {
		this.bouns = bouns;
	}

	public void setAfterTaxBouns(double afterTaxBouns) {
		this.afterTaxBouns = afterTaxBouns;
	}
	
	
	
	
	
}
