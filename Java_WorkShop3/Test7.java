package Java_WorkShop3;
import java.util.Scanner;
public class Test7 {

	public static void main(String[] args) {
		// 1부터 100까지 더하는 프로그램을 작성 한다. 단, Scanner로 1자리 정수형 데이터를 입력 받
//		아 입력 받은 수의 배수만 더한다. 
//		입력 예1: 5  
//		5,10,15, … , 100의 합 
		Scanner sc = new Scanner(System.in);
		System.out.println("한자리 정수를 입력하세요");
		int n = sc.nextInt();
		int sum = 0;
		for (int i = n; i < 101; i+=n) {
			sum += i;
			if (i ==n) {
				System.out.printf("%d",i);
			}else {
				System.out.printf(" + %d" , i);
			}
			
			
		}
		System.out.printf(" = %d",sum);
		sc.close();
	}

}
