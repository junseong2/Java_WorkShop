package Java_WorkShop2;
import java.util.Scanner;

public class Test7 {

	public static void main(String[] args) {

//		Scanner 클래스를 사용하여 키보드로 값을 입력 받아서 실행 결과와 같이 출력하시오.
		Scanner sc = new Scanner(System.in); // Scanner 객체 생성

		// Scanner 이용하여 값을 입력 받는 코드 구현
		String k = sc.nextLine();
		int k2 = sc.nextInt();
		
		
		System.out.println("1. 이름을 입력하세요");
		System.out.println(k);
		System.out.println("2. 나이를 입력하세요");
		System.out.println(k2);
		System.out.println("이름은 "+k+" 나이는 "+k2+" 입니다.");
		
		


		sc.close();
	}

}
