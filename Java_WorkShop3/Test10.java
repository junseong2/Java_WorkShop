package Java_WorkShop3;
import java.util.Scanner;
public class Test10 {

    public static void main(String[] args) {
        // Scanner 클래스를 사용하여 키보드로 정수값을 입력 받아서 1부터 입력 받은 정수값까지의 총
//    	합을 구하는 실습. 단, 음수 및 0 을 입력한 경우에는 다시 입력 받는다. 
        Scanner sc = new Scanner(System.in);
        System.out.println("정수 3개를 입력해봐");    
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int maxs = 0;
        if ( a>b && a>c) {
        	maxs = a;
        }else if (a<b && b > c) {
        	maxs = b;
        }else {
        	maxs = c;
        }

        System.out.println("a 값 : " + a);
        System.out.println("b 값 : " + b);
        System.out.println("c 값 : " + c);
        System.out.println("최댓값 : " + maxs);
        
        sc.close();
    	
    }
}


