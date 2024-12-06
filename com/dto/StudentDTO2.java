package com.dto;

public class StudentDTO2 {

    private String termNo;
    private String studentNo;
    private String classNo;
    private Double point;
    private String className;
    private String grade;
    private String StudentName;



	
	public String getTermNo() {
		return termNo;
	}




	public String getStudentNo() {
		return studentNo;
	}




	public String getClassNo() {
		return classNo;
	}




	public Double getPoint() {
		return point;
	}




	public String getClassName() {
		return className;
	}




	public String getGrade() {
		return grade;
	}




	public String getStudentName() {
		return StudentName;
	}




	public void setTermNo(String termNo) {
		this.termNo = termNo;
	}




	public void setStudentNo(String studentNo) {
		this.studentNo = studentNo;
	}




	public void setClassNo(String classNo) {
		this.classNo = classNo;
	}




	public void setPoint(Double point) {
		this.point = point;
	}




	public void setClassName(String className) {
		this.className = className;
	}




	public void setGrade(String grade) {
		this.grade = grade;
	}




	public void setStudentName(String studentName) {
		StudentName = studentName;
	}




	public StudentDTO2(String termNo, String studentNo, String classNo, Double point, String className, String grade,
			String studentName) {
		super();
		this.termNo = termNo;
		this.studentNo = studentNo;
		this.classNo = classNo;
		this.point = point;
		this.className = className;
		this.grade = grade;
		StudentName = studentName;
	}




	public StudentDTO2() {
		// TODO Auto-generated constructor stub
	}




	@Override
    public String toString() {
        return termNo + "\t" + studentNo + "\t"  + StudentName + "\t" + className + "\t" + point+ "\t" + grade;
	}
}

	