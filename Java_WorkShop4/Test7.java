package Java_WorkShop4;
import java.util.Scanner;


public class Test7 {

	public static void main(String[] args) {
		// Scanner 클래스를 사용하여 입력 받은 사람 수 만큼 랜덤하게 키(height)값을 구하여 실행결
//		과와 같이 출력하도록 구현. ( Random 클래스 사용 ) -- 아직 안배움
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
