package pack02;

public class BookTest {

	public static void main(String[] args) {
		 // 3개의 Book 객체 생성
        Book book1 = new Book("SQL Plus", 50000, 5.0);
        Book book2 = new Book("Java 2.0", 40000, 3.0);
        Book book3 = new Book("JSP Servlet", 60000, 6.0);

     // 각각의 Book 객체의 정보를 출력
        System.out.println(book1.getBookName() + " " + book1.getBookPrice() + "원 " + book1.getBookDiscountRate() + "% " + (int) book1.getDiscountBookPrice() + "원");
        System.out.println(book2.getBookName() + " " + book2.getBookPrice() + "원 " + book2.getBookDiscountRate() + "% " + (int) book2.getDiscountBookPrice() + "원");
        System.out.println(book3.getBookName() + " " + book3.getBookPrice() + "원 " + book3.getBookDiscountRate() + "% " + (int) book3.getDiscountBookPrice() + "원");
    }
}