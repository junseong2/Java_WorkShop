package Java_WorkShop3;

public class Test6 {

	public static void main(String[] args) {
		// 세 개의 주사위를 던졌을 때, 눈의 곱이 3의 배수인 값을 출력하는 프로그램을 작성하시오 
		
		for (int i = 1; i < 7; i++) {
			for (int j = 1; j < 7; j++) {
				for (int j2 = 1; j2 < 7; j2++) {
					if ((i*j*j2)%3==0) {
						System.out.printf("%d * %d * %d = %d \n", i,j,j2,i*j*j2);
					}
				}
			}
			
		}

	}

}
