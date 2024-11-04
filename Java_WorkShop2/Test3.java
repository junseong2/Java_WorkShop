package Java_WorkShop2;

public class Test3 {

	public static void main(String[] args) {
	
		
		//문자형 변수 ch가 영문자(대문자 또는 소문자)일 때만 변수 b의 값이 true가 되도록 프로그램
//		을 완성 하시오.
		
		char ch = 'z';
		boolean b = (ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z');
		System.out.println(b);


	}

}
