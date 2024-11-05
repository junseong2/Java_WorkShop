package Java_WorkShop3;
import java.util.Scanner;
public class Test10 {

    public static void main(String[] args) {
        // Scanner 클래스를 사용하여 키보드로 정수값을 입력 받아서 1부터 입력 받은 정수값까지의 총
//    	합을 구하는 실습. 단, 음수 및 0 을 입력한 경우에는 다시 입력 받는다. 
        Scanner sc = new Scanner(System.in);  
        int a ;


        while (true) {
            System.out.println("양의 정수를 입력하시오"); 
            a = sc.nextInt();
            
            if (a>0) {
            	break;
            }else {
            	System.out.println("다시 입력하세요");
            }
        }
        System.out.printf("n의 값 : %d\n" , a);
        int sum = 0;
        for (int i = 1; i <= a; i++) {
        	sum +=i;
			
		}System.out.printf("1부터 %d 까지의 총합 : %d",a,sum);

        
        sc.close();
    	
    }
}


