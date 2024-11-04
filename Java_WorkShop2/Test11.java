package Java_WorkShop2;
import java.util.Scanner;

public class Test11 {

	public static void main(String[] args) {

//		Scanner 클래스를 사용하여 키보드로 세 개의 정수값을 입력 받아서 최대값을 구하는 코드 작
//		업. 단, 한 번의 3항 연산자만 사용할 것 

		Scanner sc = new Scanner(System.in); // Scanner 객체 생성

		// Scanner 이용하여 값을 입력 받는 코드 구현
		
		System.out.println("정수를 입력하세요");
		int n = sc.nextInt();
		System.out.println(n);		
		System.out.println("정수를 입력하세요");
		int n2 = sc.nextInt();
		System.out.println(n2);		
		System.out.println("정수를 입력하세요");
		int n3 = sc.nextInt();
		System.out.println(n3);		
		
		
		int max = ((n>n2)? ((n>n3)? n:n3) : (n2>n3)? n2:n3);		
		System.out.printf("정수 %d 와 정수 %d, 정수 %d 중에서 최대값 %d", n,n2,n3,max);
		sc.close();
	}

}
