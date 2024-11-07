package Java_WorkShop3;
import java.util.Scanner;
public class Test19 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
      
        System.out.print("몇 단 삼각형입니까? : ");
        int n = scanner.nextInt();
        
       
        for (int i = 1; i <= n; i++) {
            
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            
            
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }
            
           
            System.out.println();
        }
        
        // 스캐너 닫기
        scanner.close();
    }
}


