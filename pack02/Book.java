package pack02;

public class Book {
	private String bookName;
	private int bookPrice;
	private double bookDiscountRate;
	
	//생성자
	public Book() {}
	
	public Book(String bookName, int bookPrice ,double bookDiscountRate ) {
	    this.bookName = bookName;
	    this.bookPrice = bookPrice;
	    this.bookDiscountRate = bookDiscountRate;
	}
	//메서드
	public double  getDiscountBookPrice () {
		 return bookPrice * (1 - bookDiscountRate / 100);
	}

	public String getBookName() {
		return bookName;
	}

	public int getBookPrice() {
		return bookPrice;
	}

	public double getBookDiscountRate() {
		return bookDiscountRate;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public void setBookPrice(int bookPrice) {
		this.bookPrice = bookPrice;
	}

	public void setBookDiscountRate(double bookDiscountRate) {
		this.bookDiscountRate = bookDiscountRate;
	}
	



}

