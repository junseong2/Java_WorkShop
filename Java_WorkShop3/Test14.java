package Java_WorkShop3;

public class Test14 {

    public static void main(String[] args) {
//    	반복문을 사용하여 실행결과와 같이 출력되도록 코드를 구현하시오.  

    	System.out.println("------------------곱셈표-------------------");
    	
    	int maxs = 9;
    	for (int i = 1; i <= maxs; i++) {
			for (int j = 1; j <= maxs; j++) {
				System.out.printf("%4d",i * j );
			}System.out.println();
		}
    	
    }
}

