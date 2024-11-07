package Java_WorkShop3;

public class Test21 {

    public static void main(String[] args) {
//    	for문을 사용하여 1부터 100가지 출력한다. 단, 한 줄에 10개씩 실행결과와 같이 출력한다. 
    	
    	int maxs = 10;
    	for (int i = 0; i < maxs; i++) {
			for (int j = 1; j <= maxs; j++) {
				System.out.printf("%4d",(i*10) + j);
			}System.out.println();
    	}
    }
}



