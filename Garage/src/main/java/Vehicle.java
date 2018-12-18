public class Vehicle {
	private int wheels;
	private int windows;
	private int seats;
	private static int counterID;
	private int id;
	

	public Vehicle(int wheels, int windows, int seats) {
		this.wheels = wheels;
		this.windows = windows;
		this.seats = seats;
		setID();
	}

	public int getWheels() {
		return wheels;
	}

	public void setWheels(int wheels) {
		this.wheels = wheels;
	}

	public int getWindows() {
		return windows;
	}

	public void setWindows(int windows) {
		this.windows = windows;
	}

	public int getSeats() {
		return seats;
	}

	public void setSeats(int seats) {
		this.seats = seats;
	}

	public int getID() {
		return this.id;
	}

	public void setID() {
		this.counterID++;
		this.id = this.counterID;		
	}
	
	public String toString(Vehicle vehicle)
	{
		String type = vehicle.getClass().toString();
		
		return "Type: " + type + "\tWheels: " + wheels 
				+ "\tWindows: " + windows + "\tSeats: " + seats;
	}
}
