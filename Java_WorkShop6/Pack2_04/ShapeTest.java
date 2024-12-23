package Pack2_04;

public class ShapeTest {

	public static void main(String[] args) {
		
		//배열 만들기
        Shape[] shape = new Shape[6];
        shape[0] = new Triangle(7, 5, "Blue");
        shape[1] = new Rectangle(4, 6, "Blue");
        shape[2] = new Triangle(6, 7, "Blue");
        shape[3] = new Rectangle(8, 3, "Red");
        shape[4] = new Triangle(9, 8, "Red");
        shape[5] = new Rectangle(5, 7, "White");
        
        //변경전 넓이 출력
        System.out.println("기본정보");
        for (Shape s : shape) {
			System.out.println(s.getClass().getSimpleName()+"\t"+ s.getArea() + "\t" + s.getColor());
		}
        
        //변경후 넓이 출력
		System.out.println("사이즈를 변경 후 정보");
		for (Shape s : shape) {
			((Resize)s).setResize(5);
			System.out.println(s.getClass().getSimpleName()+"\t"+ s.getArea() + "\t" + s.getColor());
			
		}

	}

}
