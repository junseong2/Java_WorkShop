package Java_WorkShop4;



public class Test4 {

	public static void main(String[] args) {
		// 다음 배열의 내용을 실행 결과와 같이 출력 되도록 프로그램을 작성 하시오.


		
		
		int[] arr = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
		int[] arr2 = new int [arr.length] ;
		for (int i = 10; i > 0; i--) {
			arr2[10-i] +=arr[i-1];
		}
		for (int i = 0; i < arr2.length; i++) {
			System.out.print(arr2[i]+ " ");
		}
	}

}
