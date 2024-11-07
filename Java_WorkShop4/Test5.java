package Java_WorkShop4;



public class Test5 {

	public static void main(String[] args) {
		// 다음 배열의 내용을 실행 결과와 같이 거꾸로 출력 되도록 프로그램을 작성 하시오.



		
		
		int[][] arr2 = {
				 {20, 30, 10},
				 {50, 40, 60},
				 {80, 80, 90}
				 };
		int idx = 0;
//System.out.println(arr2.length * arr2[0].length);
		int[] arr1 = new int [arr2.length*arr2[0].length] ;
		for (int i = arr2.length-1 ; i >= 0; i--) {
			for (int j = arr2[i].length-1;  j >= 0; j--) {
			arr1[idx++] +=arr2[i][j];				
			}
		}
		for (int i = 0; i < arr1.length; i++) {
			System.out.print(arr1[i]+ " ");
		}
	}

}
