package pack06;

public class Student {

	private String name;
	private int age;
	private int hight;
	private int weigt;
	
	public Student() {}

	public Student(String name, int age, int hight, int weigt) {
		this.name = name;
		this.age = age;
		this.hight = hight;
		this.weigt = weigt;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public int getHight() {
		return hight;
	}

	public int getWeigt() {
		return weigt;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setHight(int hight) {
		this.hight = hight;
	}

	public void setWeigt(int weigt) {
		this.weigt = weigt;
	}
    public void displayInfo() {
        System.out.println("Name: " + getName() + ", Age: " + getAge() + ", Height: " + getHight() + ", Weight: " + getWeigt());
    }
	
}

	