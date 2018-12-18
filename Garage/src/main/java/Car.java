
public class Car extends Vehicle {

	double length;
	String color;
	
	public Car(int wheels, int windows, int seats, double length, String color) 
	{
		super(wheels, windows, seats);
		
		this.length = length;
		this.color = color;
	}
	
	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString(Vehicle vehicle)
	{		
		return "ID: " + vehicle.getID() + "\tType: Car\t\tWheels: " + vehicle.getWheels() 
				+ "\tWindows: " + vehicle.getWindows() + "\tSeats: " + vehicle.getSeats()
				+ "\tLength: " + length + "\tColor: " + color;
	}
}
