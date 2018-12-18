
public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehicle car1 = new Car(3, 6, 2, 2.2, "Blue");
		
		Vehicle van1 = new Van(4, 10, 6, 140.5, 121);
		
		Vehicle motorcycle1 = new Motorcycle(2, 0, 1, 2, 400);
		
		Garage garage1 = new Garage();
		
		
		garage1.addVehicle(car1);
		garage1.addVehicle(van1);
		garage1.addVehicle(motorcycle1);
		
		System.out.println(car1.toString(car1));
//		System.out.println(van1.toString(van1));
//		System.out.println(motorcycle1.toString(motorcycle1));
//		
//		garage1.fixVehicle();
//		
//		garage1.removeVehicle(2);
//		garage1.removeVehicle(car1);
		garage1.emptyGarage();
	}
}
