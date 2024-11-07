package Java_WorkShop4;
import java.util.Scanner;


public class Test9 {

	public static void main(String[] args) {
		// 다음과 같이 선언되어 있는 배열에 1~10까지의 랜덤한 숫자(중복허용)를 넣고 이 배열에 어떤
//		값이 셋팅 되었는지 출력 하고 배열 데이터의 합과 평균을 구하는 프로그램을 작성 하시오.
//		int[] arr3 = new int[5]
//		또한, 합은 정수형으로 평균은 실수형으로 출력한다.
		Scanner sc = new Scanner(System.in);


		
		
		int[] arr3 = new int[5];
		
		for (int i = 0; i < arr3.length; i++) {
			 while (true) {
	            arr3[i] = sc.nextInt();
	            if (arr3[i] >= 1 && arr3[i] <= 10) {
	                break; 
	            } else {
	                System.out.println("잘못된 입력입니다. 1~10 사이의 숫자를 입력하세요.");
	            }
	        }
			
		}
		int sum = 0;
		float lens = arr3.length;
		for (int i = 0; i < arr3.length; i++) {
			sum += arr3[i];
		}
		System.out.println("sum = " + sum);
		System.out.println("avg = " + sum/lens);
		sc.close();
	}

}
