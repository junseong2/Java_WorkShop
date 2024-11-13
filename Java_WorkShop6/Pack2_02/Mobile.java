package Pack2_02;

public abstract class Mobile {
	
	private String mobile;
	private int batterySize;
	private String osType;

	public Mobile() {
		super();
	}

	public Mobile(String mobile, int batterySize, String osType) {
		super();
		this.mobile = mobile;
		this.batterySize = batterySize;
		this.osType = osType;
	}

	public String getMobile() {
		return mobile;
	}

	public int getBatterySize() {
		return batterySize;
	}

	public String getOsType() {
		return osType;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public void setBatterySize(int batterySize) {
		this.batterySize = batterySize;
	}

	public void setOsType(String osType) {
		this.osType = osType;
	}

	public abstract int operate (int time);
	public abstract int charge (int time);
	
//	+ operate(time:int):int // 사용
//	+ charge(time:int):int // 충전
	
	
}
