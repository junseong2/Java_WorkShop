package pack2_01;

public class Truck extends Car {

	public Truck() {
		super();
	}

	public Truck(int maxWeight, double oilTankSize, double efficiency, double restOil, int curWeight) {
		super(maxWeight, oilTankSize, efficiency, restOil, curWeight);
	}

	public Truck(int maxWeight, double oilTankSize, double efficiency) {
		super(maxWeight, oilTankSize, efficiency);
	}





	@Override
	public double getEfficiency() {
		double eff = super.getEfficiency() - ((getCurWeight()/5)*0.2);
		return eff;
	}
//	@Override
	public void moving(int distance) {
		double oil = calcOil(distance);
        double oil2 = getRestOil() - oil;
        setRestOil(oil2);
	}
	private double calcOil(int distance) {
		return distance / getEfficiency();
	}
	public int getCost(int distance) {
		double oil = calcOil(distance);
        return (int) (oil * 3000);
	}
	
	@Override
	public String toString() {
		return super.toString() + "\t" +  getEfficiency();
	}
//	+ getEfficiency(): double
//	+ moving(distance:int): void
//	- calcOil(distance:int): double
//	+ getCost(distance:int): int
}
