package domain.vehicle;

public abstract class Car extends Vehicle {
	
	private int numPassengers;
	private int numClow; 
	private int trunkCapacity;

	public Car(String trademark, String model, int changes, int maximumSpeed, int cylinder, int numPassengers, int numClow, int trunkCapacity) {
		super(trademark, model, changes, maximumSpeed, cylinder);
		this.numPassengers= numPassengers;
		this.numClow= numClow;
		this.trunkCapacity=trunkCapacity;
	
	}

	public int getNumPassengers() {
		return numPassengers;
	}

	public void setNumPassengers(int numPassengers) {
		this.numPassengers = numPassengers;
	}

	public int getNumClow() {
		return numClow;
	}

	public void setNumClow(int numClow) {
		this.numClow = numClow;
	}
	
	

}
