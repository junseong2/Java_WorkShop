package Pack2_02;

public class Ltab extends Mobile {
	
	public Ltab() {
		super();
	}

	public Ltab(String mobile, int batterySize, String osType) {
		super(mobile, batterySize, osType);
	}

	@Override
	public int operate(int time) {
		if(getOsType().equals("AP-01")) {
			setBatterySize(getBatterySize() - (10*time));
			return getBatterySize() - (10*time);
		}return getBatterySize();
	}
//	사용을 통해 배터리 감소 구현,
//	1분 사용 시 밧데리 10감소
//	잔여 배터리 리턴
	@Override
	public int charge(int time) {
		if(getOsType() == "AP-01") {
			setBatterySize(getBatterySize() + (10*time));
			return getBatterySize() + (10*time);
		}return 0;
	}

	@Override
	public String toString() {
		return getMobile() + "\t" + getBatterySize() + "\t"	+ getOsType(); 
	}
	
	

}
