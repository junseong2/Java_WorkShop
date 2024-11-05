package Java_WorkShop3;
import java.util.Scanner;

public class Test13 {

    public static void main(String[] args) {
//    	Scanner 클래스를 사용하여 키보드로 2자리의 양의 정수값을 입력 받아서 출력하는 실습. 
//    	단 2자리 양의 정수가 아니면 다시 입력 받는다. 
        Scanner sc = new Scanner(System.in);  
        int a;

        System.out.print("양의 정수값 자릿수 구하기");
        while (true) {

            a = sc.nextInt();
            int l ;
            l = String.valueOf(a).length();
            if (a > 0 && l==2 ) {
            
                	break;
                
            	
            }
            else{ 
            	System.out.printf("입력 : %d \n",a);
            }
        }

        		
        		
        System.out.printf("입력값은  %d \n", a );

        sc.close();
    }
}

