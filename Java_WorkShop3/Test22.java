package Java_WorkShop3;

public class Test22 {

    public static void main(String[] args) {
    	// for문을 사용하여 실행결과와 같이 출력하는 코드 작성.  
    	
    	char [] alp = new char[5];
    	char ch = 'A';
    	
    	for (int i = 0, num = 65; i < alp.length; i++ , num ++) {
    		alp[i] = ch++;
    		System.out.println(alp);
			
		}
    }
}


