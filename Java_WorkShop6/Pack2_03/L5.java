package Pack2_03;

public class L5 extends Car implements Temp  {

	public L5() {
		super();
	}

	public L5(String name, String engine, int oilTank, int oilSize, int distance) {
		super(name, engine, oilTank, oilSize, distance);
	}


    @Override
    public void go(int distance) {
        setDistance(getDistance() + distance);
        setOilSize(getOilSize() - (distance / 8)); 
    }

    @Override
    public void setOil(int oilSize) {
        setOilSize(getOilSize() + oilSize); 
    }

    @Override
    public int getTempGage() {
        return getDistance() / 5; 
    }

	
	
	
	
	
	
	
	
	
	
	
}
