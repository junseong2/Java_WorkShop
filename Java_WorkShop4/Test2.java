package Java_WorkShop4;

public class Test2 {

	public static void main(String[] args) {
		// 2차원 배열 arr2에 담긴 모든 값의 총합과 평균을 구하는 프로그램을 작성 하시오.


		
		
		int[][] arr2 = {
				{ 5, 5, 5, 5, 5},
				{10,10,10,10,10},
				{20,20,20,20,20},
				{30,30,30,30,30}
				};
		int sum = 0 ;
		float cnt = 0;
		for (int i = 0; i < arr2.length ; i++) {
			for (int j = 0; j < arr2[i].length; j++) {
				sum +=arr2[i][j];
				cnt ++;
			}
		}System.out.println("sum = "+sum);
		System.out.println("average = " + sum/cnt);
	}

}
