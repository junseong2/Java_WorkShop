package Java_WorkShop2;
import java.util.Scanner;

public class Test9 {

	public static void main(String[] args) {

//		Scanner 클래스를 사용하여 키보드로 두 개의 정수값을 입력 받아서 최대값을 구하는 코드 작
//		업. 단, 3항 연산자만 사용할 것

		Scanner sc = new Scanner(System.in); // Scanner 객체 생성

		// Scanner 이용하여 값을 입력 받는 코드 구현
		int k = sc.nextInt();
		int k2 = sc.nextInt();
		int k3 = (k>k2)? k:k2;
		
		System.out.println("1. 정수를 입력하세요");
		System.out.println(k);
		System.out.println("2. 정수를 입력하세요");
		System.out.println(k2);
		System.out.println("정수 "+k+"와 정수 "+k2+"중에서 최대값 : "+ k3);
		
		


		sc.close();
	}

}
