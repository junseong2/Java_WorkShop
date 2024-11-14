package Pack2_04;

public class Rectangle extends Shape implements Resize {

	public Rectangle() {
		super();
	}

	public Rectangle(int width, int height, String color) {
		super(width, height, color);
	}


	@Override
	public double getArea() {
		return getWidth()*getHeight();
	}
	
	@Override
	public void setResize(int size) {
		setWidth(getWidth()+size);
	}
	
	
	
	

}
