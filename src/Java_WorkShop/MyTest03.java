package Java_WorkShop;

public class MyTest03 {

	public static void main(String[] args) {
		// 다음과 같은 조건을 만족하는 프로그램을 작성 하시오
		// 다음과 같은 변수에 값이 저장되어 있을 때, 두 변수의 값을 바꾸는 코드를 작성하시오.
		//( 즉, n의 변수에는 20을 저장하고 n2의 변수에는 10이 저장되도록 한다.)
		// 직접 입력하지 말고 변수를 통해서 값이 바뀌어야 한다
		
		int n = 10;
		int n2 = 20;
		
		int k = n;
		n = n2;
		n2 = k;
		
		
		
		
		System.out.println("n의 값은 " + n);
		System.out.println("n2의 값은 " + n2);

	}

}
