package Java_WorkShop4;
import java.util.Scanner;


public class Test6 {

	public static void main(String[] args) {
		// Scanner 클래스를 사용하여 키보드로 키(height)값을 입력 받아서 최대값을 구하는 코드 작
//		업. 입력 받은 사람 수만큼 배열을 생성하여 사용한다.
		Scanner sc = new Scanner(System.in);
		System.out.println("키의 최대값을 구합니다.");
		System.out.print("사람수 : ");
		int k = sc.nextInt();
		System.out.println();
		int [] n = new int [k];
		
		for (int i = 0; i < k; i++) {
			System.out.print("사람 "+(i+1)+ " : ");
			n[i] = sc.nextInt();
			System.out.println();
		}
		
		int maxs = n[0];
		for (int i = 0; i < k; i++) {
			if (n[i]>maxs) {
				maxs = n[i];
				
			}
			
		}System.out.printf("최대값은 %d 입니다",maxs);
		

		sc.close();
		

	}

}
