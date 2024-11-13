package pack08;

public class Cafe {
	
	private Coffee [] coffeeList; // Cafe has a Coffee
	private int index;
	
	
	public Cafe() {
		coffeeList = new Coffee[3];
	}
	
	public int totalPrice() {
		int total = 0;
		for (Coffee coffee : coffeeList) {
			total += coffee.getPrice();
		}
		return total;
	}
	
	public void setCoffee(Coffee coffee) {

		if (index == coffeeList.length) {
			System.out.println("더 이상 저장할 수 없습니다");
		}else {
			coffeeList[index] = coffee;
			index++;
		}
	}
	
	public Coffee [] getCoffeeList() {
		return coffeeList;
	}

}
