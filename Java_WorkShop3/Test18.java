package Java_WorkShop3;
import java.util.Scanner;
public class Test18 {

    public static void main(String[] args) {
//    	Scanner 클래스를 사용하여 키보드로 정수값(단)을 입력 받아서 실행결과와 같이 *을 출력하는 	실습.  
    	Scanner sc = new Scanner(System.in);
    	System.out.println("오른쪽 아래가 직각인 이등변 삼각형을 출력합니다. ");
    	
    	System.out.println("몇 단 삼각형입니까?");
    	int a = sc.nextInt();
    	
    	for (int i = 1; i <= a; i++) {
    		for (int j = 0; j < (a-i); j++) {
				System.out.print(' ');
			}
    		for (int j = 0; j < i; j++) {
				System.out.print('*');
			}
    		
    		System.out.println();
			
		}
    	
    	sc.close();
    }
}

