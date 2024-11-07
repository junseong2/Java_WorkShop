package Java_WorkShop4;

public class Test01 {

	public static void main(String[] args) {
		// 다음 배열의 합과 평균을 구하는 프로그램을 작성 하시오.
//		int[] arr = {10, 20, 30, 40, 50};
		
		
		int[] arr = {10, 20, 30, 40, 50};
		int sum = 0 ;
		for (int i = 0; i < arr.length; i++) {
			sum +=arr[i];
		}System.out.println("sum = "+sum);
		System.out.println("avg = "+sum/arr.length);
	}

}
