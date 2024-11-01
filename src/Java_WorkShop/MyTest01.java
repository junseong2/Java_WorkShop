package Java_WorkShop;

public class MyTest01 {

	public static void main(String[] args) {
		//다음 데이터를 변수에 저장한 후, 변수를 사용하여 실행 결과와 같이 두 줄로 출력하시오
		// (단, println , print , printf 메서드를 각각 사용한다. )
		// 실행결과
//		1.println 사용 
//		이름은 홍길동 
//		나이는 20이고 주소는 서울
//		2.print 사용
//		이름은 홍길동 
//		나이는 20이고 주소는 서울
//		3.pritnf 사용
//		이름은 홍길동 
//		나이는 20이고 주소는 서울
		
		String name = "홍길동";
		int age = 20;
		String address = "서울";
		
		// 1번 문제
		System.out.println("이름은 " + name);
		System.out.println("나이는 " + age + "이고 주소는 " + address);
		System.out.println("-----------------------------");
		
		//2번 문제
		System.out.print("이름은 " + name +'\n');
		System.out.print("나이는 " + age + "이고 주소는 " + address);
		System.out.println();
		System.out.println("-----------------------------");
		
		//3번 문제
		System.out.printf("이름은 %s \n" , name);
		System.out.printf("나이는 %d이고 주소는 %s",age ,address);
		System.out.println();
		System.out.println("-----------------------------");
		
		
		



	}

}
