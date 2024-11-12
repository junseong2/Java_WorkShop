package pack05;
import java.util.Scanner;
public class TestCalc {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		if (args.length == 0) {
			System.out.println("값을 입력해주세요");
		}
		
		int input = Integer.parseInt(args[0]);
		
        if (input < 5 || input > 10) {
            System.out.println("다시 입력하세요");
        } else {
      
            Calc calc = new Calc();
            int result = calc.Cal(input);
            System.out.println("입력 값: " + input);
            System.out.println("결과: " + result);
        }
	
	
	
        sc.close();
	}
		
}


