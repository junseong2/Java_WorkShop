package Java_WorkShop2;

public class Test2 {

	public static void main(String[] args) {

//		다음과 같이 변수가 선언 되어 있을 때 실행 결과가 100의 자리만 남기고 나머지 자릿수는 0으
//		로 바꾸는 프로그램을 완성 하시오.
		
        int n = 456;
        int result = (n / 100) * 100;  // 100의 자리만 남기고 나머지 자릿수는 0으로
        System.out.println(result);  // 출력: 400

	}

}
