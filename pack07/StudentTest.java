package pack07;

public class StudentTest {

	public static void main(String[] args) {
		
        // Student 객체 생성 및 배열에 추가
        Student[] studentArray = new Student[3];
        studentArray[0] = new Student("홍길동", 15, 171, 81);
        studentArray[1] = new Student("한사람", 13, 183, 72);
        studentArray[2] = new Student("임걱정", 16, 175, 65);

        // 모든 학생 정보 출력
        for (Student student : studentArray) {
           System.out.println(student.studentInfo());
        }

        // 평균 계산
        double ageSum = 0, heightSum = 0, weightSum = 0;

        for (Student student : studentArray) {
            ageSum += student.getAge();
            heightSum += student.getHight();
            weightSum += student.getWeigt();
        }

        System.out.printf("나이 평균: %.2f \n" , (ageSum / studentArray.length));
        System.out.printf("신장 평균 : %.2f\n" , (heightSum / studentArray.length));
        System.out.printf("몸무게 평균 : %.2f\n" , (weightSum / studentArray.length));
    
        int maxAge = studentArray[0].getAge();
        int minAge = studentArray[0].getAge();
        int maxHeight = studentArray[0].getHight();
        int minHeight = studentArray[0].getHight();
        int maxWeight = studentArray[0].getWeigt();
        int minWeigth = studentArray[0].getWeigt();
        
        int maxageid = 0, minageid = 0, maxheightid = 0, minheightid = 0, maxweightid = 0, minweightid = 0;
        
        for (int i = 0; i < studentArray.length; i++) {
			if(maxAge < studentArray[i].getAge()) {
				maxAge = studentArray[i].getAge();
				 maxageid = i;
			}
			if(minAge >= studentArray[i].getAge()) {
				minAge = studentArray[i].getAge();
				 minageid = i;
			}
			if(maxHeight < studentArray[i].getHight()) {
				maxHeight = studentArray[i].getHight();
				 maxheightid = i;
			}
			if(minHeight >= studentArray[i].getHight()) {
				minHeight = studentArray[i].getHight();
				 minheightid = i;
			}
			if(maxWeight < studentArray[i].getWeigt()) {
				maxWeight = studentArray[i].getWeigt();
				 maxweightid = i;
			}
			if(minWeigth >= studentArray[i].getWeigt()) {
				minWeigth = studentArray[i].getWeigt();
				 minweightid = i;
			}
			
		}
        
        System.out.printf("나이가 가장 많은 학생 : %s \n", studentArray[maxageid].getName());
        System.out.printf("나이가 가장 적은 학생 : %s\n", studentArray[minageid].getName());
        System.out.printf("신장이 가장 큰 학생 : %s\n", studentArray[maxheightid].getName());
        System.out.printf("신장이 가장 작은 학생 : %s \n", studentArray[minheightid].getName());
        System.out.printf("몸무게가 가장 많이 나가는 학생 : %s \n", studentArray[maxweightid].getName());
        System.out.printf("몸무게가 가장 적게 나가는 학생 : %s\n ", studentArray[minweightid].getName());
        
        
	
	
	
	
	}
}


