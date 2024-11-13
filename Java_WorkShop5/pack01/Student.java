package pack01;

public class Student {
	private String name;
	private int korean;
	private int english;
	private int math;
	private int science;
	
	//생성자
	public Student() {}
	
	public Student(String name, int korean ,int english, int math, int science ) {
	    this.name = name;
	    this.korean = korean;
	    this.english = english;
	    this.math = math;
	    this.science = science;
	}
	//메서드
	public double  AVG () {
		 return (korean+english+math+science) / 4.0;
	}
	public String  Grade () {
		double avg = AVG();

        if (avg >= 90) {
            return "A";
        } else if (avg >= 70) {
            return "B";
        } else if (avg >= 50) {
            return "C";
        } else if (avg >= 30) {
            return "D";
        } else {
            return "F";
        }
	}
	//get/set메서드
	public String getName() {
		return name;
	}

	public int getKorean() {
		return korean;
	}

	public int getEnglish() {
		return english;
	}

	public int getMath() {
		return math;
	}

	public int getScience() {
		return science;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setKorean(int korean) {
		this.korean = korean;
	}

	public void setEnglish(int english) {
		this.english = english;
	}

	public void setMath(int math) {
		this.math = math;
	}

	public void setScience(int science) {
		this.science = science;
	}





}

