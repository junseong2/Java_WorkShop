package Java_WorkShop2;
import java.util.Scanner;

public class Test10 {

	public static void main(String[] args) {

//		Scanner 클래스를 사용하여 키보드로 주소값을 입력 받아서 도/시/구 이름을 출력하는 코드

		Scanner sc = new Scanner(System.in); // Scanner 객체 생성

		// Scanner 이용하여 값을 입력 받는 코드 구현
		
		System.out.println("주소를 입력하세요");
//		String address = sc.nextLine();
//		String[] address2 = address.split(" ");
		
//		String si = address2[0];
//		String gu = address2[1];
//		String dong= address2[2];
		
		String si = sc.next();
		String gu = sc.next();
		String dong = sc.next();
		
		System.out.println("시명 : " + si);
		System.out.println("구명 : " + gu);
		System.out.println("동명 : " + dong);
				
		sc.close();
	}

}
