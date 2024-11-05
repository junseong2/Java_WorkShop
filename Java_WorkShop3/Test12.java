package Java_WorkShop3;
import java.util.Scanner;

public class Test12 {
		
    public static void main(String[] args) {
    	// Scanner 클래스를 사용하여 키보드로 양의 정수값을 입력 받아서 자릿수를 출력하는 실습. 
//    	 단 음수값 입력시  다시 입력 받는다. 
        Scanner sc = new Scanner(System.in);  
        int a;

       
        while (true) {
            System.out.print("양의 정수값 자릿수 구하기");
            a = sc.nextInt();

            if (a > 0) {
                break; 
            } else {
            }
        }
        int l ;
        l = String.valueOf(a).length();
        		
        		
        System.out.printf("그 수는 %d 자리입니다.\n", l );

        sc.close();
    }
}
