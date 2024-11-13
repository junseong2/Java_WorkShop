package Pack2_02;

public class Otab extends Mobile {
	
	public Otab() {
		super();
	}

	public Otab(String mobile, int batterySize, String osType) {
		super(mobile, batterySize, osType);
	}

	@Override
	public int operate(int time) {
		if(getOsType() == "AND-20") {
			setBatterySize(getBatterySize() - (12*time));
			return getBatterySize() - (12*time);
		}return 0;
	}
	@Override
	public int charge(int time) {
		if(getOsType() == "AND-20") {
			setBatterySize(getBatterySize() + (8*time));
			return (getBatterySize() + (8*time));
		}return 0;
	}
	@Override
	public String toString() {
		return getMobile() + "\t" + getBatterySize() + "\t"	+ getOsType(); 
	}

}
