import java.text.DecimalFormat;
import java.util.ArrayList;

public class Garage {

	private ArrayList<Vehicle> listOfVehicles = new ArrayList<Vehicle>();
	
	public void addVehicle(Vehicle vehicle)
	{
		listOfVehicles.add(vehicle);
	}
	
	public void removeVehicle(int vehicleID)
	{
		listOfVehicles.removeIf(vehicle -> vehicleID == vehicle.getID());
//		listOfVehicles.forEach(System.out::println);
	}
	
	public void removeVehicle(Vehicle vehicle)
	{
		listOfVehicles.removeIf(v -> vehicle.getClass().equals(v.getClass()));
//		listOfVehicles.forEach(System.out::println);
	}
	
	public void fixVehicle()
	{//calculate and return bill to fix vehicle
		DecimalFormat df2 = new DecimalFormat(".##");
		double price = 0;
		String type = "";
		
		for (Vehicle vehicle : listOfVehicles)
		{
			if (vehicle instanceof Car)
			{
				type = "car";
				price += 99.99;
			}
			else if (vehicle instanceof Van)
			{
				type = "van";
				price += 199.99;			
			}
			else if (vehicle instanceof Motorcycle)
			{
				type = "motorcycle";
				price += 120.99;
			}
			
			if (vehicle.getWindows() > 3)
			{
				price += 50.55;
			} 
			else 
			{
				price += 10;
			}
			
			if (vehicle.getSeats() > 2)
			{
				price += 50;
			}
			else
			{
				price += 20;
			}
			
			System.out.println("The price to fix your " + type + " will be £" + df2.format(price) + ".");
		}
	}
	
	public void emptyGarage()
	{//remove all vehicles from garage
		listOfVehicles.clear();
	}
	
}
