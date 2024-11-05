package Java_WorkShop3;
import java.util.Scanner;
public class Test16 {

    public static void main(String[] args) {
//    	Scanner 클래스를 사용하여 키보드로 정수값(단)을 입력 받아서 실행결과와 같이 *을 출력하는 	실습.  
    	Scanner sc = new Scanner(System.in);
    	System.out.println("왼쪽 위가 직각인 이등변 삼각형을 출력합니다. ");
    	
    	System.out.println("몇 단 삼각형입니까?");
    	int a = sc.nextInt();
    	
    	for (int i = a; i >= 1; i--) {
    		for (int j = 1; j <= i; j++) {
				System.out.print('*');
			}System.out.println();
			
		}
    	
    	sc.close();
    }
}

