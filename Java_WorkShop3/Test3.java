package Java_WorkShop3;

public class Test3 {

	public static void main(String[] args) {
		// 다음의 for문을 while문으로 변경 하시오 
//		for(int i=0; i<=10; i++) { 
//			for(int j=0; j<=i; j++){
		int i = 0;
		int j = 0;
		while (i<=10) {
			while (j<=i) {
				System.out.print("*");
				j++;
			} 
				System.out.println();
				i++;
		}
	}

}
