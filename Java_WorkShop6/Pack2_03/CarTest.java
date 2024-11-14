package Pack2_03;

public class CarTest {

	public static void main(String[] args) {

		Car [] c = new Car[2];
        c[0] = new L3("L3", "1500",50,25,0);
        c[1] = new L5("L5", "2000",70,35,0);

        System.out.printf("vehicleName \t engineSize \t oilTank \t oilSize \t distance \t temperature \n");
        System.out.println("-----------------------------------------------------------------------------------------------");
        
        for (Car car : c) {
        	System.out.printf("    %s \t\t    %s \t   %d \t\t    %d \t\t    %d \t\t     %d \n",
                    car.getName(), car.getEngine(), car.getOilTank(), car.getOilSize(), car.getDistance(),
                    ((Temp) car).getTempGage());
		}
        System.out.println();
        System.out.println("25 주유");
        for (Car car : c) {
            car.setOil(25);
        }
        System.out.printf("vehicleName \t engineSize \t oilTank \t oilSize \t distance \t temperature \n");
        System.out.println("-----------------------------------------------------------------------------------------------");
        
        for (Car car : c) {
        	System.out.printf("    %s \t\t    %s \t   %d \t\t    %d \t\t    %d \t\t     %d \n",
                    car.getName(), car.getEngine(), car.getOilTank(), car.getOilSize(), car.getDistance(),
                    ((Temp) car).getTempGage());
		}
        System.out.println();
        System.out.println("80 주행");
        for (Car car : c) {
            car.go(80);
        }
        System.out.printf("vehicleName \t engineSize \t oilTank \t oilSize \t distance \t temperature \n");
        System.out.println("-----------------------------------------------------------------------------------------------");
        
        for (Car car : c) {
        	System.out.printf("    %s \t\t    %s \t   %d \t\t    %d \t\t    %d \t\t     %d \n",
                    car.getName(), car.getEngine(), car.getOilTank(), car.getOilSize(), car.getDistance(),
                    ((Temp) car).getTempGage());
		}
	
	
	
	
	
	
	
	}

}
