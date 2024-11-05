package Java_WorkShop3;
import java.util.Scanner;
public class Test5 {

	public static void main(String[] args) {
		// Scanner 이용하여 임의의 정수값을 입력받고, 입력 받은 정수값만큼 1부터 반복한다. 
//		이때 짝수값의 총합과 평균값을 출력하시오.
		Scanner sc = new Scanner(System.in); // Scanner 객체 생성
		
		System.out.println("정수를 입력하세요");
		int n = sc.nextInt();
		int sum = 0;
		float count = 0;
		for (int i = 1; i < n; i++) {
			if (i %2 ==0) {
				sum +=i;
				count ++;
			}
			
		}System.out.println("짝수값의 총합은 : "+ sum);
		System.out.println("평균값은 : " + sum/count);
		
		sc.close();
		
		
	}

}
