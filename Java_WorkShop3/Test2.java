package Java_WorkShop3;

public class Test2 {

	public static void main(String[] args) {
		// 1부터 20까지의 정수 중에서 2의 배수가 아니고 3의 배수가 아닌 수의 총합을 구하시오.
		int sum = 0;
		for (int n = 1 ; n<21 ; n++ ) {
			
			if ( n%2 != 0 && n%3 !=0) {
				
				sum +=n;
			}
		} 
		System.out.println(sum);

	}

}
