package pack06;

public class StudentTest {

	public static void main(String[] args) {
		
        // Student 객체 생성 및 배열에 추가
        Student[] studentArray = new Student[3];
        studentArray[0] = new Student("홍길동", 15, 171, 81);
        studentArray[1] = new Student("한사람", 13, 183, 72);
        studentArray[2] = new Student("임걱정", 16, 175, 65);

        // 모든 학생 정보 출력
        for (Student student : studentArray) {
            student.displayInfo();
        }

        // 평균 계산
        double ageSum = 0, heightSum = 0, weightSum = 0;

        for (Student student : studentArray) {
            ageSum += student.getAge();
            heightSum += student.getHight();
            weightSum += student.getWeigt();
        }

        System.out.printf("Average Age: %.2f \n" , (ageSum / studentArray.length));
        System.out.printf("Average Height : %.2f\n" , (heightSum / studentArray.length));
        System.out.printf("Average Weight : %.2f\n" , (weightSum / studentArray.length));
    }
}


