package Java_WorkShop3;
import java.util.Scanner;
public class Test20 {

    public static void main(String[] args) {
    	//보너스를 지급하려고 한다. 근무시간과 월급을 입력 받아 근무시간에 따라 보너스를 계산하여 실
//    	행결과와 같이 출력하는 코드 작성. 
//    	다음은 근무시간에 해당되는 보너스 값으로서 참고하여 구현한다. 
    	
        Scanner scanner = new Scanner(System.in);
        
      
        System.out.print("보너스 및 월급 구하기 \n");
        System.out.print("근무시간 입력 : ");
        int time = scanner.nextInt();

        System.out.print("월급 입력 : ");
        int money = scanner.nextInt();
        System.out.println();
        int bouns ;
       if ( time >= 25) {
    	   bouns = money;
       }else if(time >=20) {
    	   bouns = (int)(money*0.8);
       }else if(time >=18) {
    	   bouns = (int)(money*0.5);
       }else {
    	   bouns = 0 ;
       }
       int tpay = bouns+money; 
	   System.out.println("보너스 : "+ bouns);
	   System.out.println("지급될 급여 : "+ tpay);
        // 스캐너 닫기
        scanner.close();
    }
}

