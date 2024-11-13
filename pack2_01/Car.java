package pack2_01;

public class Car extends Vehicle {

	private double restOil;
	private int curWeight;

	
	public Car() {
		super();
	}
	public Car(int maxWeight, double oilTankSize, double efficiency) {
		super(maxWeight, oilTankSize, efficiency);
	}
	public Car(int maxWeight, double oilTankSize, double efficiency, double restOil, int curWeight) {
		super(maxWeight, oilTankSize, efficiency);
		this.restOil = restOil;
		this.curWeight = curWeight;
	}
	public double getRestOil() {
		return restOil;
	}
	public int getCurWeight() {
		return curWeight;
	}
	public void setRestOil(double restOil) {
		this.restOil = restOil;
	}
	public void setCurWeight(int curWeight) {
		this.curWeight = curWeight;
	}
	
	public void addOil(int oil) {
		if ((restOil + oil) <= getOilTankSize()) {
			restOil += oil;
		}
	}
	public void moving(int distance) {
		restOil -= (distance / getEfficiency());
	}
	public void addWeight(int weight) {
		if ((curWeight+weight) <= getMaxWeight()) {
			curWeight += weight;
		}
	}
	
	@Override
	public String toString() {
		return super.toString() + "\t" + restOil + "\t" + curWeight;
	}
	
	
	
}
