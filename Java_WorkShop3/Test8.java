package Java_WorkShop3;

public class Test8 {

    public static void main(String[] args) {
        // 1부터 100까지 반복하면서 3의 배수는 foo, 5의 배수는 bar, 7의 배수는 baz 값을 출력
        for (int i = 1; i <= 100; i++) {
            
            String output = i + ""; 
            
            // 3의 배수일 때
            if (i % 3 == 0) {
                output += " foo";
            }
            // 5의 배수일 때
            if (i % 5 == 0) {
                output += " bar";
            }
            // 7의 배수일 때
            if (i % 7 == 0) {
                output += " baz"; 
            }

            // 최종적으로 생성된 문자열 출력
            System.out.println(output); 
        }
    }
}


