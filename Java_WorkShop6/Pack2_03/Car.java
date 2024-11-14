package Pack2_03;

public abstract class Car {

	private String name;
	private String engine;
	private int OilTank; //OilTank 사이즈
	private int OilSize; //현재 주유된 Oil 양
	private int distance; //주행 거리
	
	
	public Car() {
		super();
	}


	public Car(String name, String engine, int oilTank, int oilSize, int distance) {
		super();
		this.name = name;
		this.engine = engine;
		OilTank = oilTank;
		OilSize = oilSize;
		this.distance = distance;
	}


	public String getName() {
		return name;
	}


	public String getEngine() {
		return engine;
	}


	public int getOilTank() {
		return OilTank;
	}


	public int getOilSize() {
		return OilSize;
	}


	public int getDistance() {
		return distance;
	}


	public void setName(String name) {
		this.name = name;
	}


	public void setEngine(String engine) {
		this.engine = engine;
	}


	public void setOilTank(int oilTank) {
		OilTank = oilTank;
	}


	public void setOilSize(int oilSize) {
		OilSize = oilSize;
	}


	public void setDistance(int distance) {
		this.distance = distance;
	}

	

	public abstract void go(int distance); //주행
	public abstract void setOil(int oilSize); //주유
	
	
	
	
}
