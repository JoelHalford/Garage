
public class Van extends Vehicle {
	
	private double weight;
	private double height;

	public Van(int wheels, int windows, int seats, double weight, double height) 
	{
		super(wheels, windows, seats);
		
		this.weight = weight;
		this.height = height;		
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}
	
	@Override
	public String toString(Vehicle vehicle)
	{		
		return "ID: " + vehicle.getID() + "\tType: Van\t\tWheels: " + vehicle.getWheels() 
				+ "\tWindows: " + vehicle.getWindows() + "\tSeats: " + vehicle.getSeats()
				+ "\tWeight: " + weight + "\tHeight: " + height;
	}

}
