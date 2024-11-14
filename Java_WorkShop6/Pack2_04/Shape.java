package Pack2_04;

public abstract class Shape {
	
	private int width; // 가로길이
	private int height; // 세로길이
	private String color; // 색상
	
	
	public Shape() {
		super();
	}


	public Shape(int width, int height, String color) {
		super();
		this.width = width;
		this.height = height;
		this.color = color;
	}


	public int getWidth() {
		return width;
	}


	public int getHeight() {
		return height;
	}


	public String getColor() {
		return color;
	}


	public void setWidth(int width) {
		this.width = width;
	}


	public void setHeight(int height) {
		this.height = height;
	}


	public void setColor(String color) {
		this.color = color;
	}
	
	public abstract double getArea();
	

}
