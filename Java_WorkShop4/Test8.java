package Java_WorkShop4;



public class Test8 {

	public static void main(String[] args) {
		//다음과 같이 제공된 배열에서 최대값과 최소값을 구하는 코드 작성.



		
		
		 int [] score= {99,34,67,22,11,9};
		int maxs = score[0];
		int mins = score[0];
		for (int i = 0; i < score.length; i++) {
			if (score[i]>maxs) {
				maxs = score[i];
			}
		}
		for (int i = 0; i < score.length; i++) {
			if (score[i]<mins) {
				mins = score[i];
			}
		}System.out.println("최대값 : " + maxs);
	System.out.println("최소값 : " + mins);
	}

}
