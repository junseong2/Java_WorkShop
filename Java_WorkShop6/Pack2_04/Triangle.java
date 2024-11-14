package Pack2_04;

public class Triangle extends Shape implements Resize {

	public Triangle() {
		super();
	}

	public Triangle(int width, int height, String color) {
		super(width, height, color);
	}

	@Override
	public double getArea() {
		return getWidth()*getHeight()*0.5;
	}

	@Override
	public void setResize(int size) {
		setHeight(getHeight()+size);
	}

	
	
	
	
}
