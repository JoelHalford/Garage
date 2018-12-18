
public class Motorcycle extends Vehicle {

	private int gears;
	private double maxSpeed;
	
	public Motorcycle(int wheels, int windows, int seats, int gears, double maxSpeed) 
	{
		super(wheels, windows, seats);
		
		this.gears = gears;
		this.maxSpeed = maxSpeed;
	}

	public int getGears() {
		return gears;
	}

	public void setGears(int gears) {
		this.gears = gears;
	}

	public double getMaxSpeed() {
		return maxSpeed;
	}

	public void setMaxSpeed(double maxSpeed) {
		this.maxSpeed = maxSpeed;
	}
	
	@Override
	public String toString(Vehicle vehicle)
	{		
		return "ID: " + vehicle.getID() + "\tType: Motorcycle\tWheels: " + vehicle.getWheels() 
				+ "\tWindows: " + vehicle.getWindows() + "\tSeats: " + vehicle.getSeats()
				+ "\tGears: " + gears + "\tMax Speed: " + maxSpeed;
	}

}
