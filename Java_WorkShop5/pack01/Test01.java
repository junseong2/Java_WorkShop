package pack01;

public class Test01 {

	public static void main(String[] args) {
		//자료값 넣기
		Student s1 = new Student("Kim",100,90,95,89 );
		Student s2 = new Student("Lee",60,70,99,98 );
		Student s3 = new Student("Park",68,86,60,40 );
		
		//출력하기
        System.out.println(s1.getName() + " " + "평균 : "+s1.AVG() + "학점 : " + s1.Grade() );
        System.out.println(s2.getName() + " " + "평균 : "+s2.AVG() + "학점 : " + s2.Grade() );
        System.out.println(s3.getName() + " " + "평균 : "+s3.AVG() + "학점 : " + s3.Grade() );
    }
}